package entidades;

public class PilhaDinamica {
    No topo;

    public PilhaDinamica() {
        this.topo = null;
    }

    public void empilhar(String elemento) {
        No novoNo = new No(elemento);

        if(this.topo == null) {
            this.topo = novoNo;
        }else{
            novoNo.setProx(this.topo);
            this.topo.setAnterior(novoNo);
            this.topo = novoNo;
        }
    }

    public void desempilhar() {
        if(this.topo == null) {
            System.out.println("Pilha já está vazia.");
            return;
        }
        this.topo = this.topo.getProx();
        if(this.topo != null) {
            this.topo.setAnterior(null);
        }
        System.out.println("Topo removido com sucesso.");
    }

    public void exibir() {
        if(this.topo == null) {
            System.out.println("Pilha vazia.");
        }else{
            No aux = this.topo;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }
}