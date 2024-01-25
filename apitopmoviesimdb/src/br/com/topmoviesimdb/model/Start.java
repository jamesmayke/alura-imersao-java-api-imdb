package br.com.topmoviesimdb.model;

import br.com.topmoviesimdb.JsonParser;
import br.com.topmoviesimdb.service.ConsumoApi;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Start {
    public static void main(String[] args ) {
//        JsonParser jsonParser = new JsonParser();
        Gson gson = new Gson();

        String endereco = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";

        String resultado = ConsumoApi.retornaLista(endereco);
        String formatedJson = resultado.substring(10, 92345);

        String[] splitJson = formatedJson.replace("},{","} , {").split(" , ");

        for (int i = 1; i < splitJson.length; i++) {
            GsonDto userJson = gson.fromJson(splitJson[i], GsonDto.class);
            System.out.println(userJson);
            userJson.avaliacoesFilme();
        }


//        GsonDto userJson = gson.fromJson(formatedJson, GsonDto.class);
//        List<Map<String, String>> listaDeFilmes = jsonParser.parse(resultado);
//
//        for (Map<String, String> listaFIlme: listaDeFilmes) {
//            System.out.println("\u001b[35mTítulo:\u001b[0m " + "\u001b[1m" + listaFIlme.get("title") + "\u001b[0m");
//            System.out.println("\u001b[35mPoster:\u001b[0m " + "\u001b[1m" + listaFIlme.get("image") + "\u001b[0m");
//            System.out.println("\u001b[45mClassificação: " + "\u001b[1m" + listaFIlme.get("imDbRating") + "\u001b[0m");
//            int quantidade = Integer.parseInt(listaFIlme.get("imDbRating").substring(0, 1));
//            for (int i = 0; i < quantidade; i++) {
//                System.out.print("⭐");
//            }
//            System.out.println();
//            System.out.println();
//        }
    }
}
