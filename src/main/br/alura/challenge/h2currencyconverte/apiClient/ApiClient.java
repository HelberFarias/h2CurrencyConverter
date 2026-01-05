package main.br.alura.challenge.h2currencyconverte.apiClient;
import com.google.gson.*;
import main.br.alura.challenge.h2currencyconverte.records.ExchangeData;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();

    public ExchangeData ConverterApi(String currency) throws IOException, InterruptedException {
        String API_KEY = "75aad2a0ca3e34113fb202a7";
        String curreny = currency.toUpperCase();
        String endereco = "https://v6.exchangerate-api.com/v6/" +
                API_KEY + "/latest/"
                + currency;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String resposta = response.body();
        ExchangeData exchangeData = gson.fromJson(resposta, ExchangeData.class);
        //System.out.println(exchangeData.conversion_rates());
        return exchangeData;
    }
}
