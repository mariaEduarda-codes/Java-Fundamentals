package curso.APIs.HandlingExcpetions.WritingFiles;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private String duracaoemMinutos;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb tituloOmdb){
        this.nome = tituloOmdb.title();

        if (tituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não foi possível converter o ano por ter mais de 4 caracteres");
        }

        this.anoDeLancamento = Integer.parseInt(tituloOmdb.year());
        this.duracaoemMinutos = tituloOmdb.runtime();
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " Ano de Lancamento: " + anoDeLancamento + " Duração: " + duracaoemMinutos;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.nome.compareTo(titulo.nome);
    }
}
