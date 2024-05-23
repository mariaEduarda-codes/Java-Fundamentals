import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;

        ArrayList<Compra> compras = new ArrayList<>();

        System.out.println("Digite o limite do cartão: ");
        Scanner sc = new Scanner(System.in);

        Cartao cartao = new Cartao(sc.nextInt());

        do {

            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.println("Digite o valor do compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);

            if (cartao.calculaLimite(compra) == 0) {
                System.out.println("Saldo insuficiente!");
                break;
            }

            compras.add(compra);
            System.out.println("Compra realizada!");
            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            opcao = sc.nextInt();

        } while (opcao != 0);

        System.out.println("COMPRAS REALIZADAS: ");
        Collections.sort(compras);
        for (Compra item : compras) {
            System.out.println(item);
        }
        System.out.println(cartao);
    }
}
