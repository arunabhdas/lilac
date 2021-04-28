package com.arunabhdas;

import com.arunabhdas.config.AppConfig;
import com.arunabhdas.service.CryptoAssetsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CryptoAssetsService service = applicationContext.getBean("cryptoAssetsService", CryptoAssetsService.class);
        System.out.println(service.list());
    }
}
