package br.com.ada.pooii.aula05.exercicio_resolvido;

// Interface genérica para a estrutura Stack
public interface Stack<T> {
    void push(T elemento);
    T pop();
    T peek();
    boolean isEmpty();
}

