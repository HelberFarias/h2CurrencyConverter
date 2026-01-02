package main.br.alura.challenge.h2currencyconverte.currencyData;
import main.br.alura.challenge.h2currencyconverte.records.ConversionRates;


// //////////////////////////////////////////////////////////////////////////////////////////////
// OBJETIVO DA CLASSE! //
// a classe em questão tem como objetivo fazer o calculo de converção das moedas de forma dinamica
// ///////////////////////////////////////////////////////////////////////////////////////////////



public class ConverterService {
    private ConversionRates rates;

    public ConversionRates getRates() {
        return rates;
    }

    public ConverterService(ConversionRates rates) {
        this.rates = rates;
    }

    //public double convertRates (String from, String to, double amount) {
        //if (from.equals(to)) {
           // return amount;
       // }
        //double rateFrom = getRates(from);
       // double rateTo = getRates(to);

    //}
}
