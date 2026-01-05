package main.br.alura.challenge.h2currencyconverte;
import main.br.alura.challenge.h2currencyconverte.currencyData.ConverterService;

import java.util.Scanner;

public class Menu {
    private final ConverterService converterService;

    public Menu(ConverterService converterService) {
        this.converterService = converterService;
    }

    public void startMenu (){
        Scanner input = new Scanner(System.in);
        boolean out = false;
        System.out.println("Welcome to H2 Currency Converter!");

        while(!out){
            System.out.printf(
                        "------------------" +
                        "\n------ Menu ------\n" +
                        "------------------\n"+
                            "1 - Currency Converter\n" +
                            "2 - Out of Program\n");
            System.out.println("Please, enter your choice: " );
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Please, digit currency code: \n" +
                                " -- BRL --\n" +
                                " -- EUR --\n" +
                                " -- USD-- \n" +
                                " -- JPY-- \n" +
                                " -- GBP-- \n" +
                                " -- AUD --\n");
                    String from = input.nextLine().toUpperCase();
                    System.out.println("Please, digit the currency converter: \n" +
                                " -- BRL --\n" +
                                " -- EUR --\n" +
                                " -- USD-- \n" +
                                " -- JPY-- \n" +
                                " -- GBP-- \n" +
                                " -- AUD --\n");
                    String to = input.nextLine().toUpperCase();
                    System.out.println("Please, enter the amount to convert: ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    double totalConverted = converterService.convertRate(from, to, amount);
                    System.out.println("Total converted: " + totalConverted);
                   break;

                case 2:
                    System.out.println("Out of system..");
                    out = true;
                    break;

                default:
                    System.out.println("Wrong choice. Try again");

            }
        }
    }
}
