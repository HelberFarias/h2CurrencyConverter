package main.br.alura.challenge.h2currencyconverte.records;

import java.util.Map;

public record ConversionRates(
        Map<String, Double> rates) {}
