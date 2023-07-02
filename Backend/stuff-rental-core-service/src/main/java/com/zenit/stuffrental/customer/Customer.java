package com.zenit.stuffrental.customer;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "customer_sequence"
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
    @NotNull(message = "Birthday cannot be empty")
    private LocalDate birthday;

    @Transient
    private Integer age;

    protected Customer() {}

    public Customer(String name,
                    String surname,
                    String email,
                    String phone,
                    LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public Customer(Long id,
                    String name,
                    String surname,
                    String email,
                    String phone,
                    LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
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
        if (CustomerValidation.patternMatches(name,CustomerValidation.patternName())) {
            this.name = name.strip();
        } else System.err.println("Name should consist of at least 2 letters of the English alphabet," +
                " with only the first of them capitalized.");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (CustomerValidation.patternMatches(surname,CustomerValidation.patternSurname())) {
            this.surname = surname.strip();
        } else System.err.println("Surname should consist of at least 2 letters of the English alphabet," +
                " with only the first of them capitalized.");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (CustomerValidation.patternMatches(email,CustomerValidation.patternEmail())) {
            this.email = email.toLowerCase().strip();
        } else System.err.println("Email can contain letters, numbers, _, -, .");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (CustomerValidation.patternMatches(phone,CustomerValidation.patternPhone())) {
            this.phone = phone
                    .replace(".","-")
                    .replace(" ","-")
                    .strip();
        } else System.err.println("Phone must contain 9 digits after 3, - or .");
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (CustomerValidation.patternMatches(String.valueOf(birthday),CustomerValidation.patternBirthday())) {
            this.birthday = birthday;
        } else System.err.println("Birthday should be in format yyyy-MM-dd");
    }

    public Integer getAge() {
        return Period.between(birthday,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                '}';
    }
}
