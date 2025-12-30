package main.br.alura.challenge.h2currencyconverte;

import main.br.alura.challenge.h2currencyconverte.currencyData.ConverterService;
import main.br.alura.challenge.h2currencyconverte.currencyData.DisponibleCurrencyList;

import java.util.Scanner;

public class Menu {
    public void startMenu (){
        Scanner input = new Scanner(System.in);
        boolean out = false;
        System.out.println("Welcome to H2 Currency Converter!");
        String choice = input.nextLine();
        while(!out){
            System.out.println("Please, enter your choice: " );
            System.out.println(
                    "\nMenu:\n"+
                            "1 - Currency Converter%n" +
                            "2 - Currency Code List%n" + // fazer um filtro dentro dessa opção para mostrar a moeda mais valorizada (comparable)
                            "3 - Out of Program ");
            switch (choice) {
                case 1:
                    System.out.println("Please, digit currency code: ");
                    DisponibleCurrencyList currencyList = new DisponibleCurrencyList();
                    String currencyChoice = input.nextLine();
                    System.out.println("Please, digit the currency converter: ");
                    DisponibleCurrencyList currencyList = new DisponibleCurrencyList();
                    String converterChoise = input.nextLine();
                    System.out.println("Please, enter the amount to convert: ");
                    double amountToConvert = input.nextDouble();
                    ConverterService converterService = new ConverterService();
                    converterService.calculateConversio(currencyChoice, converterChoise);







            }
        }
    }
}
