package com.swagger.ui.springboot;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
///@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.swagger.ui.springboot.controller")).paths(regex("/.*")).build();

		// return new Docket(DocumentationType.SWAGGER_2)
		// .ignoredParameterTypes(Pageable.class)
		// .select().apis(RequestHandlerSelectors.any())
		// .paths(regex("/v1/.*"))
		// .build();

	}

}
