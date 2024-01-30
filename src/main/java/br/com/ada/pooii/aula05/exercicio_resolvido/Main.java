package br.com.ada.pooii.aula05.exercicio_resolvido;

public class Main {
    public static void main(String[] args) {
        // Criando uma pilha de inteiros
        Stack<Integer> pilhaDeInteiros = new StackImpl<>();

        // PUSH
        pilhaDeInteiros.push(10);
        pilhaDeInteiros.push(20);
        pilhaDeInteiros.push(30);

        // PEEK
        System.out.println("Elemento do topo: " + pilhaDeInteiros.peek());

        // POP
        System.out.println("Desempilhando: " + pilhaDeInteiros.pop());
        System.out.println("Desempilhando: " + pilhaDeInteiros.pop());

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilhaDeInteiros.isEmpty());

        // Desempilhando o último elemento
        System.out.println("Desempilhando: " + pilhaDeInteiros.pop());

        // Verificando se a pilha está vazia novamente
        System.out.println("A pilha está vazia? " + pilhaDeInteiros.isEmpty());
    }
}
