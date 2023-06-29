package com.zenit.stuffrental.staff;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Staff {

    @Id
    @SequenceGenerator(
            name = "staff_sequence",
            sequenceName = "staff_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "staff_sequence"
    )
    private Long id;
    @NotNull(message = "Name can not be empty")
    private String name;
    @NotNull(message = "Surname cannot be empty")
    private String surname;
    @NotNull(message = "Email cannot be empty")
    @Email(message = "Email can contain letters, numbers, _, -, .",
            regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;
    @NotNull(message = "Phone cannot be empty")
    private String phone;

    protected Staff() {}

    public Staff(String name,
                 String surname,
                 String email,
                 String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public Staff(Long id,
                 String name,
                 String surname,
                 String email,
                 String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StaffValidation.patternMatches(name, StaffValidation.patternName())) {
            this.name = name.strip();
        } else System.err.println("Name should consist of at least 2 letters of the English alphabet," +
                " with only the first of them capitalized.");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (StaffValidation.patternMatches(surname, StaffValidation.patternSurname())) {
            this.surname = surname.strip();
        } else System.err.println("Surname should consist of at least 2 letters of the English alphabet," +
                " with only the first of them capitalized.");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (StaffValidation.patternMatches(email, StaffValidation.patternEmail())) {
            this.email = email.toLowerCase().strip();
        } else System.err.println("Email can contain letters, numbers, _, -, .");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (StaffValidation.patternMatches(phone, StaffValidation.patternPhone())) {
            this.phone = phone
                    .replace(".","-")
                    .replace(" ","-")
                    .strip();
        } else System.err.println("Phone must contain 9 digits after 3, - or .");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
