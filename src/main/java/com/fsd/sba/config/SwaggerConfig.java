package com.fsd.sba.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import({ springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration.class })
public class SwaggerConfig {
	@Value(value = "${swagger.enabled}")
	Boolean swaggerEnabled;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).enable(swaggerEnabled).select()
				.apis(RequestHandlerSelectors.basePackage("com.fsd.sba")).paths(PathSelectors.any()).build()
				.pathMapping("/");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Training System User Management Service：Swagger2 API Document").description("User Management Service")
				.contact(new Contact("Liang Xiong", "https://github.com/liangx8892", "liangx8892@163.com")).version("1.0.0").build();
	}

}
