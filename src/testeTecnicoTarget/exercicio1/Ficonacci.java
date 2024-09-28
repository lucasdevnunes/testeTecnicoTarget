package testeTecnicoTarget.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ficonacci {

    private List listaFibonacci;

    public Ficonacci() {
        List<Long> fibonacci = new ArrayList<>();
        fibonacci.add(0L);
        fibonacci.add(1L);
        for (int i = 1; i < 90; i++) {
            long numeroAtual = fibonacci.get(i);
            long numeroAnterior = fibonacci.get(i - 1);
            long numeroPosterior = numeroAnterior + numeroAtual;
            fibonacci.add(numeroPosterior);
        }
        this.listaFibonacci = fibonacci;
    }

    public List getListaFibonacci() {
        return this.listaFibonacci;
    }

}
