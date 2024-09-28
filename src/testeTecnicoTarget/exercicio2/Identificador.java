package testeTecnicoTarget.exercicio2;

public class Identificador {
    private String palavra;

    public Identificador(String palavra) {
        this.palavra = palavra;
    }

    public void identificadorDeAs(){
        int iteracoes = this.palavra.length();
        int contador = 0;
        for (int i = 0; i < iteracoes; i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'A'){
                contador++;
            }
        }
        if (contador != 0){
            System.out.println("A palavra " + this.palavra + " tem " + contador + " letras 'a'.");
        } else {
            System.out.println("A palavra " + this.palavra + " não tem nenhuma letra 'a'.");
        }
    }
}
