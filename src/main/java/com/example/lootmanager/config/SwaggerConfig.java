package com.example.lootmanager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI lootManagerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("LootManager API")
                        .description("API para gerenciamento de loot, jogadores e progressão de raids no World of Warcraft")
                        .version("v1")
                        .contact(new Contact()
                                .name("Robson Monteiro")
                                .url("https://github.com/robsonmonteirolacerda")
                                .email("contato@lootmanager.dev"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT"))
                );
    }
}
