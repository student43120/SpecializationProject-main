package com.zenit.stuffrental.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository
                .findCustomerByEmail(customer.getEmail());
        if(customerOptional.isPresent()){
            throw new IllegalStateException("This email is taken." +
                    " Pleas reset password for your account or use another email.");
        }
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        boolean exist = customerRepository.existsById(customerId);
        if (!exist) {
            throw new IllegalStateException(
              "Customer with id " + customerId + " does not exists");
        }
        customerRepository.deleteById(customerId);
    }

    @Transactional
    public void updateCustomer(Long customerId,
                               String name,
                               String surname,
                               String email,
                               String phone,
                               LocalDate birthday) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalStateException(
                        "Customer with id " + customerId + " does not exists"));

        if (name != null
                && name.length() > 2
                && !Objects.equals(customer.getName(), name)) {
            customer.setName(name);
        }

        if (surname != null
                && surname.length() > 2
                && !Objects.equals(customer.getSurname(), surname)) {
            customer.setSurname(surname);
        }

        if (email != null
                && email.length() > 0
                && !Objects.equals(customer.getEmail(), email)) {
            Optional<Customer> customerOptional = customerRepository
                    .findCustomerByEmail(email);
            if (customerOptional.isPresent()) {
                throw new IllegalStateException("This email is taken." +
                        " Pleas reset password for your account or use another email.");
            }
            customer.setEmail(email);
        }

        if (phone != null
                && phone.length() == 11
                && !Objects.equals(customer.getPhone(), phone)) {
            customer.setPhone(phone);
        }

        if (birthday != null
                && !Objects.equals(customer.getBirthday(), birthday)) {
            customer.setBirthday(birthday);
        }

    }
}
