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
}
