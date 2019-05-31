package org.partner.minsa.acs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan 
@EntityScan("org.partner.minsa.acs.domain")
@MapperScan ("org.partner.minsa.acs.mapper") 
public class AngularSecurityRestOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngularSecurityRestOauthApplication.class, args);
    }
}
