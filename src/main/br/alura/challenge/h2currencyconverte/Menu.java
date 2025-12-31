package main.br.alura.challenge.h2currencyconverte;
import main.br.alura.challenge.h2currencyconverte.currencyData.ConverterService;
import main.br.alura.challenge.h2currencyconverte.currencyData.DisponibleCurrencyList;
import java.util.Scanner;

public class Menu {
    public void startMenu (){
        Scanner input = new Scanner(System.in);
        boolean out = false;
        System.out.println("Welcome to H2 Currency Converter!");

        while(!out){
            System.out.printf(
                        "\nMenu:\n" +
                            "1 - Currency Converter%n" +
                            "2 - Currency Code List%n" + // fazer um filtro dentro dessa opção para mostrar a moeda mais valorizada (comparable)
                            "3 - Out of Program%n "
            );
            System.out.println("Please, enter your choice: " );
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please, digit currency code: ");
                    String base_code = input.nextLine();
                    input.nextLine();
                    //DisponibleCurrencyList currencyList = new DisponibleCurrencyList();
                    System.out.println("Please, digit the currency converter: ");
                    String conversion_rate = input.nextLine();

                    //DisponibleCurrencyList currencyList = new DisponibleCurrencyList();
                    System.out.println("Please, enter the amount to convert: ");
                    double amountToConvert = input.nextDouble();

                    ConverterService converterService = new ConverterService();

                    break;
                default:
                    System.out.println("Vooti");
                    break;







            }
        }
    }
}
