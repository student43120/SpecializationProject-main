package com.zenit.stuffrental.staff;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class StaffConfig {
    @Bean
    CommandLineRunner commandLineRunnerStaff(
            StaffRepository repository) {
        return args -> {
            Staff karolina = new Staff(
                    "Karolina",
                    "Nowak",
                    "karolina.nowak@gmail.com",
                    "555-123-456"
            );

            Staff michal = new Staff(
                    "Michal",
                    "Kowalski",
                    "michal.kowalski@gmail.com",
                    "777-987-654"
            );
            Staff anna = new Staff(
                    "Anna",
                    "Szymańska",
                    "anna.szymanska@gmail.com",
                    "123-456-789"
            );
            Staff mateusz = new Staff(
                    "Mateusz",
                    "Wojciechowski",
                    "mateusz.wojciechowski@gmail.com",
                    "987-654-321"
            );
            Staff adam = new Staff(
                    "Adam",
                    "Kowalczyk",
                    "adam.kowalczyk@gmail.com",
                    "111-222-333"
            );
            Staff martyna = new Staff(
                    "Martyna",
                    "Jankowska",
                    "martyna.jankowska@gmail.com",
                    "444-555-666"
            );
            repository.saveAll(
                    List.of(karolina,michal,anna,mateusz,adam,martyna)
            );
        };
    }
}
