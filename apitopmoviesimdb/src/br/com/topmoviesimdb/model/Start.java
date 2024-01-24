package br.com.topmoviesimdb.model;

import br.com.topmoviesimdb.service.ConsumoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Start {
    public static void main(String[] args ) {
        String endereco = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";

        ConsumoApi consumo = new ConsumoApi();

        String resultado = consumo.retornaLista(endereco);
        System.out.println(resultado);

    }
}
