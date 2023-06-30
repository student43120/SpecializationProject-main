package com.zenit.stuffrental.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunnerCustomer(
            CustomerRepository repository) {
        return args -> {
            Customer agnieszka = new Customer(
                    "Agnieszka",
                    "Dziemianowicz-Bąk",
                    "agnieszka.dziemianowiczbak@gmail.com",
                    "779-874-876",
                    LocalDate.of(1984, JANUARY,20)
            );

            Customer anna = new Customer(
                    "Anna",
                    "Żukowska",
                    "anna.zukowska@gmail.com",
                    "743-824-806",
                    LocalDate.of(1983, JUNE,11)
            );
            repository.saveAll(
                    List.of(agnieszka,anna)
            );
        };
    }
}
