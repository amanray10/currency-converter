package com.example.currency.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class CurrencyRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String currencyCode;

    @Positive
    private double rate; // rate compared to base currency (e.g., INR)

    public CurrencyRate() {}

    public CurrencyRate(String currencyCode, double rate) {
        this.currencyCode = currencyCode;
        this.rate = rate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }
    public double getRate() { return rate; }
    public void setRate(double rate) { this.rate = rate; }
}
