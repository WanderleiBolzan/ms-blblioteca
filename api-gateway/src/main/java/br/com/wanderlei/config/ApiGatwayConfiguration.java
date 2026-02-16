/*
package br.com.wanderlei.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatwayConfiguration {

    @Bean
    public RouteLocator gatwayRouter(RouteLocatorBuilder builder){

        return builder.routes()
                .route(p -> p.path("/book-service/**").uri("lb:///book-service"))
                .route(p -> p.path("/exchange-service/**").uri("lb:///exchange-service"))
                .build();
    }



}
*/
