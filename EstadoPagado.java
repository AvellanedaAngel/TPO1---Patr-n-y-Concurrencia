public class EstadoPagado implements EstadoPedido { 
    
    public void procesar(Pedido pedido) {
        pedido.setEstado("Pedido: " + pedido.getId() + " en proceso de entrega");
        pedido.setEstado(new EstadoEnviado());
    }

    public void cancelar(Pedido pedido) {
        pedido.setEstado("Pedido: " + pedido.getId() + " cancelado");
        pedido.setEstado(new EstadoCancelado());
    }
    
}