import java.util.Scanner;

public class BC1020_Maneira2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idadeEmDias = sc.nextInt();

        int mes = (idadeEmDias % 365) / 30;
        int anos = idadeEmDias / 365;
        int dias = (idadeEmDias % 365) % 30;

        String mensagem = """
                %d ano(s)
                %d mes(es)
                %d dia(s)
                """.formatted(anos, mes, dias);

        System.out.println(mensagem);
        }
}