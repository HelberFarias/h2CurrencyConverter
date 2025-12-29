
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Bora pra cima mundão!");
        ApiClient newApiClient = new ApiClient();
        newApiClient.ConverterApi("BRL");
        System.out.println(newApiClient);
    }
}
