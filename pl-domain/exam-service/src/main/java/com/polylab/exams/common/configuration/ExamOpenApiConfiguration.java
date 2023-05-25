package com.polylab.exams.common.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExamOpenApiConfiguration {

    @Bean
    public OpenAPI countryOpenApi(@Value("${apiTitle}") String apiTitle,
                                  @Value("${apiDescription}") String apiDescription,
                                  @Value("${apiVersion}") String apiVersion,
                                  @Value("${apiContactName}") String apiContactName,
                                  @Value("${apiContactEmail}") String apiContactEmail) {
        return new OpenAPI()
            .components(new Components())
            .info(new Info()
                .title(apiTitle)
                .description(apiDescription)
                .version(apiVersion)
                .contact(new Contact().name(apiContactName).email(apiContactEmail)
                )
            );
    }
}
