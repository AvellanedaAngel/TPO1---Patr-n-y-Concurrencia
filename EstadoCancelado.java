public class EstadoCancelado implements EstadoPedido { 
    public void procesar(Pedido pedido) {
        pedido.mostrarMensaje("Pedido: " + pedido.getId() + " ha sido cancelado");
    }
    public void cancelar(Pedido pedido) {
        pedido.mostrarMensaje("Pedido: " + pedido.getId() + " ya fue cancelado");
    } 
}