package estruturas.listacircularduplamenteencadeada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListaCircularDuplamenteEncadeada<T> {
    private No<T> head = null;
    private No<T> tail = null;

    public boolean listaVasia(){
        return head == null && tail == null;
    }

    public void adicionar(T valor){
        No<T> novoNo = new No<>(valor);

        if(listaVasia()){
            head = novoNo;
            tail = novoNo;
        }

        novoNo.setProximo(head);
        novoNo.setAnterior(tail);

        this.setHead(novoNo);

        novoNo.getProximo().setAnterior(novoNo);
        tail.setProximo(novoNo);
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
