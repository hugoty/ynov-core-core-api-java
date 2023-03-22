package fr.ynov.planner.core.common.config.openapi;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Planner API", description = "Documentation des API du Planner.", version = "1.0.0"))
public class OpenApiConfiguration {
}
