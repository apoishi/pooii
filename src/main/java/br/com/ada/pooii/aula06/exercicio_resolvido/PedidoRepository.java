package br.com.ada.pooii.aula06.exercicio_resolvido;
public class PedidoRepository {
    public void salvar(Pedido pedido) {
        System.out.println("Pedido salvo: " + pedido.getId());
    }

    public Pedido buscarPedido(long id) {
        System.out.println("Buscando pedido: " + id);
        return null;
    }

    public void atualizar(long id, Pedido pedido) {
        System.out.println("Pedido atualizado: " + id);
    }

    public void deletar(long id) {
        System.out.println("Pedido deletado: " + id);
    }
}
