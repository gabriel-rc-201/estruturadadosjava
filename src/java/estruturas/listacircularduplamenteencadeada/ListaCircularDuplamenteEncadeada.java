package src.java.estruturas.listacircularduplamenteencadeada;

public class ListaCircularDuplamenteEncadeada<T> {
    private No<T> head = null;
    private No<T> tail = null;

    public No<T> getHead() {
        return head;
    }

    public void setHead(No<T> head) {
        this.head = head;
    }

    public No<T> getTail() {
        return tail;
    }

    public void setTail(No<T> tail) {
        this.tail = tail;
    }

    public boolean isVazio(){
        return head == null && tail == null;
    }

    public void adicionar(T valor){
        No<T> novoNo = new No<>(valor);

        if(isVazio()){
            head = novoNo;
            tail = novoNo;
        }

        novoNo.setProximo(head);
        novoNo.setAnterior(tail);

        this.setTail(novoNo);

        novoNo.getProximo().setAnterior(novoNo);
        novoNo.getAnterior().setProximo(novoNo);
    }

    public T remover(No<T> noASerRemovido){
        No<T> proximo = noASerRemovido.getProximo();
        No<T> anterior = noASerRemovido.getAnterior();

        if(noASerRemovido.equals(head)){
            this.setHead(proximo);
        } else if(noASerRemovido.equals(tail)){
            this.setTail(anterior);
        }

        noASerRemovido.setProximo(null);
        noASerRemovido.setAnterior(null);

        proximo.setAnterior(anterior);
        anterior.setProximo(proximo);

        return noASerRemovido.getValor();
    }
}
