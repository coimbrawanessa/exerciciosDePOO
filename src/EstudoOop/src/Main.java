import Models.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Crie uma classe pessoa, que possua os seguintes atributos:
        nome e idade. em seguida, estancie um objeto pessoa com o nome wanessa e idade 25
        e imprima a mensagem com nome e idade. **/
        Scanner entrada= new Scanner(System.in);
        System.out.println("quantidade de pessoas");
        int qntdPessoas = entrada.nextInt();
        Pessoa[] pessoa = new Pessoa[qntdPessoas];
        for(int posicao = 0; posicao < qntdPessoas; posicao++){
            pessoa[posicao] = new Pessoa();
            System.out.println("Inserir Nome");
            pessoa[posicao].nome = entrada.next();
            System.out.println("Inserir idade");
            pessoa[posicao].idade = entrada.nextInt();

        }
        int maior = pessoa[0].idade;


        for(int posicao = 0; posicao < qntdPessoas; posicao++){
            System.out.println(pessoa[posicao].nome  + " "+ pessoa[posicao].idade);

            if (pessoa[posicao].idade > maior) {
                maior = pessoa[posicao].idade;
            }


        }
        System.out.println( "A maior idade é : " + maior);



    }
}