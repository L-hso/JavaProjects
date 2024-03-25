package primeiro_projeto_java.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Joguinho jogando = new Joguinho();
        jogando.iniciar();

        jogando.adivinharNome();
        jogando.advinharIdade();
    }
}

class Joguinho {
    private String nome_do_jogador;
    private int idade_do_jogador;

    public Joguinho() {

    }

    public void iniciar() {
        Scanner lerDados = new Scanner(System.in);
            System.out.println("Informe seu nome!");
            nome_do_jogador = lerDados.nextLine();

            System.out.println("Informe sua idade!");
            idade_do_jogador = lerDados.nextInt();
        
    }

    public void adivinharNome() {
        Scanner lerVontade = new Scanner(System.in);
        System.out.println("Você quer que eu adivinhe seu nome?");
        boolean vontade = lerVontade.nextBoolean();

        if (vontade) {
            System.out.println("Seu nome é... " + nome_do_jogador);
        } else {
            System.out.println("Tudo bem.");
        }
    }

    public void advinharIdade() {
        Scanner lerVontade = new Scanner(System.in);
        System.out.println("Você quer que eu adivinhe seu nome?");
        boolean vontade = lerVontade.nextBoolean();

        if (vontade) {
            System.out.println("Sua idade é... " + idade_do_jogador);
        } else {
            System.out.println("Tudo bem.");
        }
    }
}