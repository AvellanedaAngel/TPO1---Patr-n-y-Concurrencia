public class EstadoEnviado implements EstadoPedido { 
    public void procesar(Pedido pedido) {
        pedido.setEstado("Pedido: " + pedido.getId() + " entregado");
        pedido.setEstado(new EstadoEntregado());
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado("Pedido: " + pedido.getId() + " cancelado");
        pedido.setEstado(new EstadoCancelado());
    }
}