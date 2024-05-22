package estruturas.listacircularduplamenteencadeada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class No<T> {
    private T valor;
    private No<T> proximo;
    private No<T> anterior;

    public No(T valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        No<?> no = (No<?>) obj;
        return valor.equals(no.getValor());
    }
}
