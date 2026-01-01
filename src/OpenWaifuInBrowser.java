import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.awt.Desktop;

public class OpenWaifuInBrowser {

    public static void main(String[] args) {

        try {
            // Create HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // Create request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.waifu.pics/sfw/waifu"))
                    .GET()
                    .build();

            // Send request
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            // Get image URL from JSON
            String json = response.body();
            String imageUrl = json.split("\"url\":\"")[1].split("\"")[0];

            // Print URL
            System.out.println("Opening image:");
            System.out.println(imageUrl);

            // Open in browser
            Desktop.getDesktop().browse(new URI(imageUrl));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

