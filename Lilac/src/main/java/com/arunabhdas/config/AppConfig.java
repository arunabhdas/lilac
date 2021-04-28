package com.arunabhdas.config;

import com.arunabhdas.service.CryptoAssetsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("cryptoAssetsService")
    public CryptoAssetsService getCryptoAssetsService() {
        return new CryptoAssetsService();
    }
}
