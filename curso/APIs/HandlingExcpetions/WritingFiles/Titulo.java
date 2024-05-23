package curso.APIs.HandlingExcpetions.WritingFiles;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " Ano de Lancamento: " + anoDeLancamento;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.nome.compareTo(titulo.nome);
    }
}
