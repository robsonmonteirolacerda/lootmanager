package com.example.lootmanager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI lootManagerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("LootManager API")
                        .description("API para gerenciamento de loots de raids (WoW)")
                        .version("v1.0.0")
                );
    }
}
