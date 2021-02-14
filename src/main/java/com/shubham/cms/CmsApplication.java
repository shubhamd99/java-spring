package com.shubham.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// To use JPA repositories, we have to indicate it to Spring. We can do this with @EnableJpaRepositories.
// Spring will look for repositories in the sub packages of this @Configuration class.
// Also note, that Spring Boot does this automatically if it finds Spring Data JPA on the classpath.

@SpringBootApplication
@EnableJpaRepositories
public class CmsApplication {

    public static void main(String[] args) {
        // Spring will run CmsApplication Class
        SpringApplication.run(CmsApplication.class, args);
    }

}
