package br.com.ada.pooii.aula05.exercicio_resolvido;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
    private final List<T> pilha;

    public StackImpl() {
        pilha = new ArrayList<>();
    }

    @Override
    public void push(T elemento) {
        pilha.add(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.remove(pilha.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.get(pilha.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return pilha.isEmpty();
    }
}

