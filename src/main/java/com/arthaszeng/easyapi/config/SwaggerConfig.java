package com.arthaszeng.easyapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createSwaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .ignoredParameterTypes()
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.arthaszeng.easyapi"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Category API",
                "This is a simple API for prictice.",
                "1.0",
                "localhost:8080",
                "Chaowei Zeng",
                "No License",
                "No Licence URL"
        );
    }

}
