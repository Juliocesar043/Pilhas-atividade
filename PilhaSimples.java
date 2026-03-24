package entidades;

public class PilhaSimples {
    public String[] pilha;
    public int topo;

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
        this.topo = 0;
        System.out.println("Existem " + tamanho + " posições.");
    }

    public boolean estaCheio() {
        if(this.topo == this.pilha.length) {
            return true;
        } else {
            return false;
        }
    }

    public void empilhar(String elemento) {
        if(elemento == null) {
            System.out.println("Não é possível adicionar um elemento nulo.");
            return;
        }

        if(!estaCheio()) {
            this.pilha[this.topo] = elemento;
            this.topo++;
        }else {
            System.out.println("Não há espaço disponível na Pilha.");
        }
    }

    public void exibir() {
        for(int i = this.topo - 1; i >= 0; i--) {
            System.out.println(this.pilha[i]);
        }
    }

    public void desempilhar(){
        this.pilha[this.topo-1] = null;
        System.out.println("Elemento " + this.pilha[this.topo-1] + " foi removido.");

    }
}