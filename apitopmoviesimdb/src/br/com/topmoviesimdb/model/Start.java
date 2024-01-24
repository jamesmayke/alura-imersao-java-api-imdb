package br.com.topmoviesimdb.model;

import br.com.topmoviesimdb.JsonParser;
import br.com.topmoviesimdb.service.ConsumoApi;
import java.util.List;
import java.util.Map;

public class Start {
    public static void main(String[] args ) {
        JsonParser jsonParser = new JsonParser();

        String endereco = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";

        String resultado = ConsumoApi.retornaLista(endereco);

        List<Map<String, String>> listaDeFilmes = jsonParser.parse(resultado);

        for (Map<String, String> listaFIlme: listaDeFilmes) {
            System.out.println("\u001b[35mTítulo:\u001b[0m " + "\u001b[1m" + listaFIlme.get("title") + "\u001b[0m");
            System.out.println("\u001b[35mPoster:\u001b[0m " + "\u001b[1m" + listaFIlme.get("image") + "\u001b[0m");
            System.out.println("\u001b[45mClassificação: " + "\u001b[1m" + listaFIlme.get("imDbRating") + "\u001b[0m");
            int quantidade = Integer.parseInt(listaFIlme.get("imDbRating").substring(0, 1));
            for (int i = 0; i < quantidade; i++) {
                System.out.print("⭐");
            }
            System.out.println();
            System.out.println();
        }
    }
}
