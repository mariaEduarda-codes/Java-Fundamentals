public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + ": " + valor;
    }

    @Override
    public int compareTo(Compra compra) {
        return Double.compare(this.valor, compra.valor);
    }

}
