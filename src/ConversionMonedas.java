import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionMonedas {
    String codigoB;
    String codigoO;
    String monto;
    String agregarDatos;
    String direccion = "https://v6.exchangerate-api.com/v6/5e8da58a9bfbe0781117fbad/pair/";
    HttpClient cliente;
    HttpRequest request;
    HttpResponse<String> response;

    public ConversionMonedas(String codigoB, String codigoO, String monto) throws IOException, InterruptedException {

        agregarDatos = codigoB + "/" + codigoO + "/" + monto;
        direccion += agregarDatos;
        cliente = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
        response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
        //return new Gson().fromJson(response.body(), Conversion.class);
    }

    public String getRespuestaJson(){
        return response.body();
    }

}