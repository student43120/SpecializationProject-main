package com.zenit.stuffrental.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunnerProduct(
            ProductRepository repository) {
        return args -> {
            Product longWeek = new Product(
                    "LongWeek",
                    OfferType.SINGLEROOM,
                    LocalDate.of(2023,JANUARY,30),
                    LocalDate.of(2023,JULY,4),
                    1200.50,
                    true,
                    5L
            );

            Product weekChill = new Product(
                    "WeekChill",
                    OfferType.DOUBLEROOM,
                    LocalDate.of(2023,JUNE,23),
                    LocalDate.of(2023,JUNE,29),
                    800.90,
                    false,
                    7L
            );
            repository.saveAll(
                    List.of(longWeek,weekChill)
            );
        };
    }
}
