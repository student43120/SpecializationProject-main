package com.zenit.stuffrental.staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository
        extends JpaRepository<Staff, Long> {
    //@Query("SELECT c FROM Customer c WHERE c.email = ?1")
    Optional<Staff> findStaffByEmail(String email);
}
