import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();

        for (int i = 100; i > -1; i--) {
            inteiros.add(i);
        }

        System.out.println(inteiros);
        Collections.sort(inteiros);
        System.out.println(inteiros);

        Titulo titulo = new Titulo("Duna");
        Titulo titulo2 = new Titulo("Maze Runner");
        Titulo titulo3 = new Titulo("Hunger Games");
        Titulo titulo4 = new Titulo("Divergent");
        Titulo titulo5 = new Titulo("Harry Potter");
        Titulo titulo6 = new Titulo("Twilight");

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);
        titulos.add(titulo5);
        titulos.add(titulo6);

        Collections.sort(titulos);
        System.out.println(titulos);
    }
}
