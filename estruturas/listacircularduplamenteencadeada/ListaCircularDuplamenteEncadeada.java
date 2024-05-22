package estruturas.listacircularduplamenteencadeada;

public class ListaCircularDuplamenteEncadeada<T> {
    private No<T> head = null;
    private No<T> tail = null;

    public Boolean listaVasia(){
        if (head == null && tail == null) return true;
        else return false;
    }

    public void adicionaInicio(T valor){
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

    public void adicionarFinal(T valor) {
        No<T> novoNo = new No<>(valor);

        if (listaVasia()) {
            head = novoNo;
            tail = novoNo;           
        }

        novoNo.setProximo(head);
        novoNo.setAnterior(tail);

        tail = novoNo;

        novoNo.getProximo().setAnterior(novoNo);
        novoNo.getAnterior().setProximo(novoNo);
    }
}
