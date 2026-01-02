package main;

import main.br.alura.challenge.h2currencyconverte.Menu;
import main.br.alura.challenge.h2currencyconverte.apiClient.ApiClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ApiClient newApiClient = new ApiClient();
        Menu menu = new Menu();
        menu.startMenu();
        newApiClient.ConverterApi("USD");


    }
}
