package main.br.alura.challenge.h2currencyconverte.currencyData;
import main.br.alura.challenge.h2currencyconverte.records.ConversionRates;

import java.util.Map;


public class ConverterService {
    private final Map<String, Double> rates;

    public ConverterService(Map<String, Double> rates) {
        this.rates = rates;
    }

    public double convertRate (String from, String to, double amount) {
        double rateFrom = rates.get(from);
        double rateTo = rates.get(to);
        return (amount / rateFrom) * rateTo;
    }
}
