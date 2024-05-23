public class Cartao {
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public double calculaLimite(Compra compra) {
        if (compra.getValor() < this.limite) {
            return limite -= compra.getValor();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Saldo do cartão: " + this.limite;
    }
}
