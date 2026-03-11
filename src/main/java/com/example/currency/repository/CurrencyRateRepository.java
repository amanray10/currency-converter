package com.example.currency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.currency.entity.CurrencyRate;
import java.util.Optional;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {
    Optional<CurrencyRate> findByCurrencyCode(String currencyCode);
}
