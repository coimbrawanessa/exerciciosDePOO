import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.velocidade = 0;
        for (int i = 0; i < 5;i++ ){
            c1.acelerar();
            System.out.println( "velocidade:" + c1.velocidade);
        }


        for ( int i = 0; i < 5; i++){
            c1.freiar();
            System.out.println( "velocidade:" + c1.velocidade);
        }



    }
}