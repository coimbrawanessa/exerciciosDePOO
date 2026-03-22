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

    public static class Carro {
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

    public static class Main {
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
}
