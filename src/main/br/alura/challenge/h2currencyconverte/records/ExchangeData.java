package main.br.alura.challenge.h2currencyconverte.records;

public record ExchangeData (
        String base_code,
        ConversionRates conversion_rates)
        {}
