package com.swagger.ui.springboot;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@Import(SwaggerConfig.class)
@EnableSwagger2
public class MvcConfig extends WebMvcConfigurationSupport {
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		// http://localhost:8080/doc/v1/api.html
		// registry.addResourceHandler("/doc/v1/**").addResourceLocations("classpath:/doc/v1/");
		// registry.addResourceHandler("/doc/v1/webjars/**")
		//registry.addResourceLocations("classpath:/META-INF/resources/webjars/");
		// http://localhost:8080/swagger-ui.html
		
		//registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

		
		
		
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		//http://localhost:8080/index.html
		//registry.addResourceHandler("**").addResourceLocations("classpath:/dist/");

	}
	
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
