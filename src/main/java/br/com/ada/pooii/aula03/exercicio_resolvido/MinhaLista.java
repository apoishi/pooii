package br.com.ada.pooii.aula03.exercicio_resolvido;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T, U> {
    private final List<T> elementos;
    private final List<U> identificadores;

    public MinhaLista() {
        elementos = new ArrayList<>();
        identificadores = new ArrayList<>();
    }

    public void adicionar(T elemento, U identificador) {
        elementos.add(elemento);
        identificadores.add(identificador);
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
    }

    public int indice(U identificador) {
        for (int i = 0; i < identificadores.size(); i++) {
            if (identificadores.get(i).equals(identificador)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        return elementos.contains(elemento);
    }
}
