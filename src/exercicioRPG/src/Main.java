import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro();
        g.nome = "Thor";
        g.vida = 100;

        g.atacar();
        g.ataquePesado();
    }
}