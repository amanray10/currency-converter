package com.example.currency.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.currency.entity.CurrencyRate;
import com.example.currency.repository.CurrencyRateRepository;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(CurrencyRateRepository repo) {
        return args -> {
            repo.save(new CurrencyRate("USD", 82.0));
            repo.save(new CurrencyRate("EUR", 90.0));
            repo.save(new CurrencyRate("INR", 1.0));
            repo.save(new CurrencyRate("GBP", 100.0));
            repo.save(new CurrencyRate("JPY", 0.6));
        };
    }
}
