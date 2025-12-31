package main.br.alura.challenge.h2currencyconverte.currencyData;
import main.br.alura.challenge.h2currencyconverte.records.ConversionRates;

import java.util.HashMap;
import java.util.Map;

// //////////////////////////////////////////////////////////////////////////////////////////////
// OBJETIVO DA CLASSE! //
// a classe em questão tem como objetivo fazer o calculo de converção das moedas de forma dinamica
// ///////////////////////////////////////////////////////////////////////////////////////////////



public class ConverterService {
    private String base_code;
    private ConversionRates conversion_rate;
    private double amount;
    Map<String, Double> rates;

    public ConverterService(String base_code, ConversionRates conversion_rate, double amount) {
        rates = new HashMap<>();
        rates.put("USD", Double.valueOf(conversion_rate.USD()));
        rates.put("EUR", Double.valueOf(conversion_rate.EUR()));
        rates.put("GBP", Double.valueOf(conversion_rate.GBP()));
        rates.put("JPY", Double.valueOf(conversion_rate.JPY()));
        rates.put("AUD", Double.valueOf(conversion_rate.AUD()));
        rates.put("BRL", Double.valueOf(conversion_rate.BRL()));
        this.base_code = base_code;
        this.conversion_rate = conversion_rate;
        this.amount = amount;
    }

    public double convert (String from, String to, double amount) {
        if (from.equals(to)) {
            return amount;
        } else if (from.equals(base_code)) {
            return amount * rates.get(to);
        } else if (to.equals(base_code)) {
            return amount * rates.get(from);
        }
    }
}
