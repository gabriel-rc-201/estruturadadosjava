package estruturas.listacircularduplamenteencadeada;

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

        head = novoNo;

        novoNo.getProximo().setAnterior(novoNo);
        tail.setProximo(novoNo);
    }

}
