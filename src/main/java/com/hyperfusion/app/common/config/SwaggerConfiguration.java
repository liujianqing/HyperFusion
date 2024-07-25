//package com.hyperfusion.app.common.config;
//
//import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * knife4j配置类
// *
// * @author ljq
// */
//@Configuration
//@EnableSwagger2
//@EnableKnife4j
//@Import(BeanValidatorPluginsConfiguration.class)
//public class SwaggerConfiguration implements WebMvcConfigurer {
//
//    @Bean(value = "defaultApi")
//    public Docket defaultApi() {
//        return new Docket(DocumentationType.OAS_30)
//                //分组名称
//                .groupName("1.0版本")
//                .select()
//                //这里指定Controller扫描包路径
//                .apis(RequestHandlerSelectors.basePackage("com.hyperfusion.app.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //进行静态资源映射
//        registry.addResourceHandler("/swagger-ui.html", "/doc.html")
//                .addResourceLocations("classpath:/META-INF/resources/", "/static", "/public");
//
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
//
//
//}