package me.webace.w7.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student adrian = new Student(
                    "Adrian",
                    "adrian.goral@webace-group.dev",
                    LocalDate.of(2002, Month.JUNE, 4)
            );
            Student maks = new Student(
                    "Maks",
                    "maks@maks.maks",
                    LocalDate.of(2003, Month.JUNE, 6)
            );
            studentRepository.saveAll(
              List.of(adrian, maks)
            );
        };
    }
}
