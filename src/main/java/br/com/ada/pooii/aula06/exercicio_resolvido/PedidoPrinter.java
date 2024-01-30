package br.com.ada.pooii.aula06.exercicio_resolvido;

import java.util.List;

public class PedidoPrinter {
    public void imprimirPedido(Pedido pedido) {
        System.out.println("Imprimindo pedido: " + pedido.getId());
    }

    public void imprimirItens(List<Item> itens) {
        System.out.println("Imprimindo itens do pedido...");
        for (Item item : itens) {
            System.out.println(item);
        }
    }
}
