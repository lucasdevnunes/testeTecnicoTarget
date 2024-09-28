import testeTecnicoTarget.exercicio1.Ficonacci;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ficonacci fibonacci = new Ficonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número gastaria de saber se pertence à sequência Fibonacci? ");
        int numero = scanner.nextInt();
        fibonacci.informarPertencimentoNoFibonacci(numero);
    }
}
