package com.nttdata.yanki.infrestructure.spring.config;

import com.nttdata.yanki.infrestructure.service.YankiCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SpringConfiguration {


    @Bean
    public YankiCrudService yankiRepository(){
        return new YankiCrudService();
    }
}
