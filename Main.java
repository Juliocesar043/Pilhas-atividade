package aplicacao;

import entidades.PilhaDinamica;
import entidades.PilhaSimples;

public class Main {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(5);

        pilhaSimples.empilhar("Arroz");
        pilhaSimples.empilhar("Feijão");
        pilhaSimples.empilhar("Macarrão");
        pilhaSimples.empilhar("Pizza");
        pilhaSimples.empilhar("Arroz");
        pilhaSimples.desempilhar();
        pilhaSimples.exibir();

        System.out.println("==================");

        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("Um");
        pilhaDinamica.empilhar("Dois");
        pilhaDinamica.empilhar("Três");
        pilhaDinamica.empilhar("Quatro");
        pilhaDinamica.exibir();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibir();

    }
}
