public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.nome = "Nessa";
        a1.nota = 8;

        Aluno a2 = new Aluno();
        a2.nome = "João";
        a2.nota = 5;

        a1.verificarAprovacao();
        a2.verificarAprovacao();
    }
}