package com.arunabhdas.config;

import com.arunabhdas.repository.CryptoAssetsRepository;
import com.arunabhdas.service.CryptoAssetsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.arunabhdas")
public class AppConfig {
    /*
    @Bean("courseRepository")
    public CryptoAssetsRepository getCryptoAssetsRepository() {
        return new CryptoAssetsRepository();
    }

    @Bean("cryptoAssetsService")
    public CryptoAssetsService getCryptoAssetsService() {
        return new CryptoAssetsService(getCryptoAssetsRepository());
    }
    */
}
