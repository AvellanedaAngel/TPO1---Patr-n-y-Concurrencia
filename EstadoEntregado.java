public class EstadoEntregado implements EstadoPedido { 
    public void procesar(Pedido pedido) {
        pedido.mostrarMensaje("Pedido: " + pedido.getId() + " entregado");
    }
    public void cancelar(Pedido pedido) {
        pedido.mostrarMensaje("Pedido: " + pedido.getId() + " no puede ser cancelado, ya fue entregado");
    }
   
}