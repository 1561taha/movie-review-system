package com.pranvi.movie_review_system.Config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customSwagger(){
        return new OpenAPI()
                .info(new Info()
                        .title("movie_review_system_apis")
                        .version("v1")
                        .description("by Taha Khan"));
//                .servers() for defining diferrent servers
    }
}
