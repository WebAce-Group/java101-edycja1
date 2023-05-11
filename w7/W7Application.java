package me.webace.w7;

import me.webace.w7.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class W7Application {

    public static void main(String[] args) {
        SpringApplication.run(W7Application.class, args);
    }

}

