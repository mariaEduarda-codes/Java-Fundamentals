package curso.APIs.HandlingExcpetions.WritingFiles;

import com.google.gson.Gson;

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

        String chave = System.getenv("OMDB_CHAVE");
        String endereco = "https://www.omdbapi.com/?t=" + titulo + "&apikey=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new Gson();
        Titulo titulo1 = gson.fromJson(response.body(), Titulo.class);
        System.out.println("Título: " + titulo1);
        //getNome() vem nulo. O "zero" de variável de referência para objeto é null
        //O Json que foi retornado veio com as chaves em inglês, como Title e Year, e não Nome ou Ano de Lançamento.
        // Usamos anotações na classe Titulo para fazer o "mapeamento"
        // Serializar é um verbo usado quando transformamos objetos ou estruturas de memória em texto -
        // não importa se é JSON, binário ou XML.
    }
}
