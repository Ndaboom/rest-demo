package com.cyberclick.restapi.interceptor.registry;

import com.cyberclick.restapi.controller.CloudVendorAPIService;
import com.cyberclick.restapi.interceptor.CloudVendorServiceInterceptor;
import com.cyberclick.restapi.models.CloudVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CloudVendorServiceInterceptorAppConfig implements WebMvcConfigurer {
    @Autowired
    CloudVendorServiceInterceptor cloudVendorServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(cloudVendorServiceInterceptor);
    }
}
