package com.zenit.stuffrental.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    @Autowired
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getStaff() {
        return staffRepository.findAll();
    }

    public void addNewStaff(Staff staff) {
        Optional<Staff> staffOptional = staffRepository
                .findStaffByEmail(staff.getEmail());
        if(staffOptional.isPresent()){
            throw new IllegalStateException("This email is taken." +
                    " Pleas reset password for your account or use another email.");
        }
        staffRepository.save(staff);
    }

    public void deleteStaff(Long staffId) {
        boolean exist = staffRepository.existsById(staffId);
        if (!exist) {
            throw new IllegalStateException(
              "Customer with id " + staffId + " does not exists");
        }
        staffRepository.deleteById(staffId);
    }

    @Transactional
    public void updateStaff(Long staffId,
                            String name,
                            String surname,
                            String email,
                            String phone) {
        Staff staff = staffRepository.findById(staffId)
                .orElseThrow(() -> new IllegalStateException(
                        "Customer with id " + staffId + " does not exists"));

        if (name != null
                && name.length() > 2
                && !Objects.equals(staff.getName(), name)) {
            staff.setName(name);
        }

        if (surname != null
                && surname.length() > 2
                && !Objects.equals(staff.getSurname(), surname)) {
            staff.setSurname(surname);
        }

        if (email != null
                && email.length() > 0
                && !Objects.equals(staff.getEmail(), email)) {
            Optional<Staff> customerOptional = staffRepository
                    .findStaffByEmail(email);
            if (customerOptional.isPresent()) {
                throw new IllegalStateException("This email is taken." +
                        " Pleas reset password for your account or use another email.");
            }
            staff.setEmail(email);
        }

        if (phone != null
                && phone.length() == 11
                && !Objects.equals(staff.getPhone(), phone)) {
            staff.setPhone(phone);
        }
    }
}
