package main;

import main.br.alura.challenge.h2currencyconverte.Menu;
import main.br.alura.challenge.h2currencyconverte.apiClient.ApiClient;
import main.br.alura.challenge.h2currencyconverte.currencyData.ConverterService;
import main.br.alura.challenge.h2currencyconverte.records.ExchangeData;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base currency (BRL, USD, EUR, JPY, GBP, AUD):");
        String baseCurrency = input.nextLine().toUpperCase();

        ApiClient apiClient = new ApiClient();
        ExchangeData exchangeData = apiClient.ConverterApi(baseCurrency);

        Map<String, Double> rates = exchangeData.conversion_rates();
        ConverterService converterService = new ConverterService(rates);

        Menu menu = new Menu(converterService);
        menu.startMenu();
    }
}

