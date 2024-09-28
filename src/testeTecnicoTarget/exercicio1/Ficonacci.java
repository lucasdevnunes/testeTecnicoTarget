package testeTecnicoTarget.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ficonacci {

    private List listaFibonacci;

    public Ficonacci() {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 1; i < 45; i++) {
            int numeroAtual = fibonacci.get(i);
            int numeroAnterior = fibonacci.get(i - 1);
            int numeroPosterior = numeroAnterior + numeroAtual;
            fibonacci.add(numeroPosterior);
        }
        this.listaFibonacci = fibonacci;
    }

    public List getListaFibonacci() {
        return this.listaFibonacci;
    }

    public void informarPertencimentoNoFibonacci(int numero){
        if (this.listaFibonacci.contains(numero)){
            System.out.println("O número " + numero + " pertence à sequência Fibonacci");
        } else {
            System.out.println("O número " + numero + " não pertence à sequêcia Fibonacci.");
        }
    }
}
