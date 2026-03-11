package com.example.currency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.currency.repository.CurrencyRateRepository;
import com.example.currency.entity.CurrencyRate;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRateRepository repo;

    public double convert(String from, String to, double amount) {
        CurrencyRate fromRate = repo.findByCurrencyCode(from.toUpperCase())
            .orElseThrow(() -> new RuntimeException("Currency not found: " + from));
        CurrencyRate toRate = repo.findByCurrencyCode(to.toUpperCase())
            .orElseThrow(() -> new RuntimeException("Currency not found: " + to));

        double inINR = amount * fromRate.getRate();
        return inINR / toRate.getRate();
    }
}
