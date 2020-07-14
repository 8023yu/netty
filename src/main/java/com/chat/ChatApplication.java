package com.chat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.gao.chat.mapper")
@ComponentScan(basePackages = {"com.gao","com.gao.chat"})
public class ChatApplication extends SpringBootServletInitializer {

    @Bean
    public SpringUtil getSpringUtil(){
        return new SpringUtil();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ChatApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }

}
