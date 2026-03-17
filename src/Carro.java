
public class Carro {
    public String marca;
    public int velocidade;

    public void acelerar(){
        velocidade += 10;
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
