package src.java.estruturas.listacircularduplamenteencadeada;

public class No<T> {
    private T valor;
    private No<T> proximo;
    private No<T> anterior;

    public No(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getProximo() {
        return this.proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return this.anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        No<?> no = (No<?>) obj;
        return valor.equals(no.getValor());
    }
}
