public class EstadoEnviado implements EstadoPedido {
    public void procesar(Pedido pedido) {
        pedido.mostrarMensaje("Pedido: " + pedido.getId() + " ha sido entregado");
        pedido.setEstado(new EstadoEntregado()); 
    }

    public void cancelar(Pedido pedido) {
        pedido.mostrarMensaje("Pedido: " + pedido.getId() + " no se puede cancelar, ya fue enviado");
       
    }
}