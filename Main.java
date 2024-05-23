import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        //Código sugerido pelo IntelliJ
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais%n", nome, idade, valor);
        //Em vez de usar println ele usou diretamente o printf

        String nome2 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);

        System.out.println(mensagem);

        Scanner leitura = new Scanner(System.in);
        System.out.println("Imprimindo o valor de leitura na próxima linha...");
        String valor_leitura = leitura.nextLine();
        System.out.println(valor_leitura);
        Scanner leitura2 = new Scanner(System.in);
        System.out.println("Imprimindo um valor inteiro...");
        int valorInteiro = leitura2.nextInt();
        System.out.println(valorInteiro);
        Scanner leitura3 = new Scanner(System.in);
        System.out.println("Imprimindo um valor real...");
        double valorReal = leitura3.nextDouble();
        System.out.println(valorReal);
        //No valor double, se eu digitar no terminal 9.9 vai dar errado
        //Mas se digitar 9,9, ele vai imprimir 9.9 normalmente
        //Isso é devido a configuração de localidade (locale)
    }
}