package entidades;

public class No {
    String conteudo;
    No prox;
    No anterior;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }
    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getAnterior(){
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

}
