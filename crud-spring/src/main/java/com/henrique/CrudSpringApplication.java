package com.henrique;

import com.henrique.model.Course;
import com.henrique.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CrudSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner initDataBase(CourseRepository courseRepository) {
        return args -> {
            courseRepository.deleteAll();

            Course c1 = new Course();
            c1.setName("Angular");
            c1.setCategories("Front-End");

            Course c2 = new Course();
            c2.setName("Spring Boot");
            c2.setCategories("Back-end");

            Course c3 = new Course();
            c3.setName("AWS");
            c3.setCategories("Cloud");

            Course c4 = new Course();
            c4.setName("Postgres");
            c4.setCategories("DataBase");

            Course c5 = new Course();
            c5.setName("Python");
            c5.setCategories("Linguagem");

            courseRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));

        };
    }
}
