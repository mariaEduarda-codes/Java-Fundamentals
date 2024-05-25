package curso.APIs.HandlingExcpetions.WritingFiles;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do título para busca: ");
        String titulo = sc.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request;
        HttpResponse<String> response;

        String chave = System.getenv("OMDB_CHAVE");
        String endereco = "https://www.omdbapi.com/?t=" + titulo + "&apikey=" + chave;

        try {
            endereco = endereco.replace(' ', '+');
            request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb tituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
            Titulo converted = new Titulo(tituloOmdb);
            System.out.println(converted);
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println("Erro ao converter o ano de lançamento: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao fazer requisição: " + e.getMessage());
        }
            finally {
            sc.close();
        }
    }
}
