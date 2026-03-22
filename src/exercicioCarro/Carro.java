package exercicioCarro;

public class Carro {
    public String marca;
    public int velocidade;

    public void acelerar(){
        velocidade += 10;
        if (velocidade > 100) {
            velocidade = 100;
            System.out.println("Velocidade máxima atingida");
        }
    }

    public void freiar(){
        if ( velocidade - 10 < 0){
            velocidade = 0;
        }
        else {
            velocidade -= 10;
        }
    }
}
