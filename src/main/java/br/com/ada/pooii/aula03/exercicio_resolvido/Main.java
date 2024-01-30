package br.com.ada.pooii.aula03.exercicio_resolvido;

public class Main {
    public static void main(String[] args) {
        MinhaLista<Pessoa, Long> listaDeNomes = new MinhaLista<>();

        var lucas = new Pessoa(1, "Lucas");
        listaDeNomes.adicionar(lucas, lucas.id());

        var jose = new Pessoa(2, "Jose");
        listaDeNomes.adicionar(jose, jose.id());

        var carlos = new Pessoa(3, "Carlos");
        listaDeNomes.adicionar(carlos, carlos.id());

        System.out.println("Elemento na posição 2: " + listaDeNomes.obter(2));
        System.out.println("A lista contém a pessoa Jose? " + listaDeNomes.contem(jose));
        System.out.println("Qual a posição do elemento de ID 3? " + listaDeNomes.indice(3L));
    }
}
