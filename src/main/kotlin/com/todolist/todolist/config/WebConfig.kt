package com.todolist.todolist.config

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")  // 모든 경로를 열어 준다
                .allowedOrigins("http://localhost:3000")    // 로컬 3000번대 허용 하겠다
                .allowedMethods(
                        HttpMethod.GET.name,
                        HttpMethod.POST.name,
                        HttpMethod.PUT.name,
                        HttpMethod.DELETE.name,
                )
    }
}