public class EstadoNuevo implements EstadoPedido { 
    public void procesar(Pedido pedido) {
        pedido.setEstado("Validando pago del pedido: " + pedido.getId());
        pedido.setEstado(new EstadoPagado());
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado("Pedido: " + pedido.getId() + " se ha cancelado");
        pedido.setEstado(new EstadoCancelado());
    }
}