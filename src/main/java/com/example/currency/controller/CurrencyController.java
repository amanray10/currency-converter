package com.example.currency.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.currency.service.CurrencyService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping("/convert")
    public double convert(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam double amount) {
        return service.convert(from, to, amount);
    }
}
