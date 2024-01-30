package br.com.ada.pooii.aula06.exercicio_resolvido;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // instâncias dos objetos
        PedidoRepository repository = new PedidoRepository();
        PedidoPrinter printer = new PedidoPrinter();
        PedidoService pedidoService = new PedidoService(repository, printer);

        // itens de exemplo
        Item item1 = new Item();
        Item item2 = new Item();
        List<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        // pedido de exemplo
        Pedido pedido = new Pedido();
        pedido.setId(1);
        pedido.setItens(itens);

        // métodos do PedidoService
        pedidoService.salvar(pedido);
        pedidoService.imprimirPedido(pedido);
        pedidoService.imprimirItens(itens);
        pedidoService.enviarEmailConfirmacao("Pedido salvo com sucesso!");

        // exemplos  buscar um pedido e atualizar
        Pedido pedidoBuscado = pedidoService.buscarPedido(1);
        if (pedidoBuscado != null) {
            System.out.println("Pedido encontrado: " + pedidoBuscado.getId());
        }

        pedidoService.atualizar(1, pedido);
        pedidoService.imprimirPedido(pedido);
    }
}
