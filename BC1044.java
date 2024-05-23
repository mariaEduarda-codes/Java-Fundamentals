import java.util.Scanner;

public class BC1044 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int valor1 = Integer.parseInt(sc1.nextLine());
        int valor2 = Integer.parseInt(sc2.nextLine());

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
