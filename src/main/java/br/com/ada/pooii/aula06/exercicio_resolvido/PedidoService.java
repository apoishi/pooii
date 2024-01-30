package br.com.ada.pooii.aula06.exercicio_resolvido;// PedidoService.java
import java.util.List;

public class PedidoService {
    private PedidoRepository repository;
    private PedidoPrinter printer;

    public PedidoService(PedidoRepository repository, PedidoPrinter printer) {
        this.repository = repository;
        this.printer = printer;
    }

    public double calcularTotalPedido() {
        return 0.0; //
    }

    public List<Item> getItens() {
        return null;
    }

    public long getQtdItens() {
        return 0;
    }

    public void addItem(Item item) {

    }

    public void deletarItem(Item item) {
    }

    public void enviarParaTransporte() {
    }

    public void salvar(Pedido pedido) {
        repository.salvar(pedido);
    }

    public void enviarEmailConfirmacao(String mensagem) {
        System.out.println("E-mail de confirmação enviado: " + mensagem);
    }

    public Pedido buscarPedido(long id) {
        return repository.buscarPedido(id);
    }

    public void atualizar(long id, Pedido pedido) {
        repository.atualizar(id, pedido);
    }

    public void imprimirPedido(Pedido pedido) {
        printer.imprimirPedido(pedido);
    }

    public void imprimirItens(List<Item> itens) {
        printer.imprimirItens(itens);
    }
}

