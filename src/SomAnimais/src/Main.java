
    public class Main {
        public static void main(String[] args) {

            Cachorro c = new Cachorro();
            c.nome = "Tobby";

            Gato g = new Gato();
            g.nome = "Digo";

            Vaca v = new Vaca();
            v.nome = "Mimosa";
            c.emitirSom();
            g.emitirSom();
            v.emitirSom();
        }
    }
