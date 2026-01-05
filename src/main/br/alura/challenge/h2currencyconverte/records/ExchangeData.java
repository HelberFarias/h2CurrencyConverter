package main.br.alura.challenge.h2currencyconverte.records;

import java.util.Map;

public record ExchangeData (
        String base_code,
        Map<String, Double> conversion_rates)
        {}
