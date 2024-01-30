package br.com.ada.pooii.aula06.exercicio_resolvido;// PedidoService.java
import java.util.List;

public class PedidoService {
    private PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public double calcularTotalPedido() { /*...*/ }
    public List<Item> getItens() { /*...*/ }
    public long getQtdItens() { /*...*/ }
    public void addItem(Item item) { /*...*/ }
    public void deletarItem(Item item) { /*...*/ }
    public void enviarParaTransporte() { /*...*/ }

    public void buscarPedido(long id) {
        repository.buscarPedido(id);
    }

    public void salvar(Pedido pedido) {
        repository.salvar(pedido);
    }

    public void atualizar(long id, Pedido pedido) {
        repository.atualizar(id, pedido);
    }

    public void deletar(long id) {
        repository.deletar(id);
    }

    public void enviarEmailConfirmacao(String mensagem) {
    }
}

