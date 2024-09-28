import testeTecnicoTarget.exercicio1.Ficonacci;
import testeTecnicoTarget.exercicio2.Identificador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ficonacci fibonacci = new Ficonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número gastaria de saber se pertence à sequência Fibonacci? ");
        int numero = scanner.nextInt();
        fibonacci.informarPertencimentoNoFibonacci(numero);

        System.out.println("\n*********************************************************\n");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra para fazer a contagem de 'as': ");
        String palavra = leitor.nextLine();
        Identificador identificador = new Identificador(palavra);
        identificador.identificadorDeAs();
    }
}
