import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class currencyConverter {


    private static final String API_KEY = "9eb0723b7dffd278d0c00e39";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base Currency (e.g. USD, INR, AED, AUD, PKR): ");
        String baseCurrency = sc.next().toUpperCase();

        System.out.print("Enter Target Currency (e.g. USD, INR, AED, AUD, PKR): ");
        String targetCurrency = sc.next().toUpperCase();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        try {
            String apiURL = "https://v6.exchangerate-api.com/v6/"
                    + API_KEY + "/latest/" + baseCurrency;

            URL url = new URL(apiURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HTTP Error: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();

            JSONObject json = new JSONObject(response.toString());

            JSONObject conversionRates = json.getJSONObject("conversion_rates");

            double rate = conversionRates.getDouble(targetCurrency);

            double convertedAmount = amount * rate;

            System.out.println("\nExchange Rate: " + rate);
            System.out.println(amount + " " + baseCurrency + " = "
                    + convertedAmount + " " + targetCurrency);

        } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
        }

        sc.close();
     }
}