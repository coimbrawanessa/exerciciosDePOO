public class Aluno {
    public String nome;
    public int nota;

    public void verificarAprovacao() {
        if (nota >= 7) {
            System.out.println(nome + " está aprovado");
        } else {
            System.out.println(nome + " está reprovado");
        }
    }
}
