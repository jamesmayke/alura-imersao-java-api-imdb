package br.com.topmoviesimdb.model;

public record GsonDto(String title, String image, String imDbRating) {

    public String avaliacoesFilme() {
        StringBuilder resultado = new StringBuilder();
        int quantidade = Integer.parseInt(imDbRating.substring(0, 1));
        resultado.append("⭐".repeat(Math.max(0, quantidade)));
        return resultado.toString();
    }
    @Override
    public String toString() {
        return  String.format(
                "Título: " + title + "\n" +
                        "Poster: " + image + "\n" +
                        "Classificação: " + imDbRating + "\n" +
                        avaliacoesFilme() + "\n"
        );
    }
}
