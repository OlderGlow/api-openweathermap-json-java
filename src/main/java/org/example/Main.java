package org.example;

import com.fasterxml.jackson.databind.*;
import org.example.bo.*;

import java.io.*;
import java.net.*;
import java.net.http.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=paris&appid=8118ed6ee68db2debfaaa5a44c832918&units=metric&lang=fr";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        CompletableFuture<HttpResponse<String>> response = HttpClient.newHttpClient().sendAsync(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        Root root = mapper.readValue(response.get().body(), Root.class);
        System.out.println("La température actuelle à " + root.getName() + " est de : " + root.getMain().getTemp() + "°C");
    }
}