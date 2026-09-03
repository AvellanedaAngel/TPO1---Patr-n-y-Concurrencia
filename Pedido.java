public class Pedido {
    private int id;
    private EstadoPedido estadoActual;
    public Pedido(int id) {
        this.id = id;
        this.estadoActual = new EstadoNuevo();
    }
    public int getId() {
        return id;
    }
    public void setEstado(EstadoPedido estado) {
        this.estadoActual = estado;
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void procesar() {
        estadoActual.procesar(this);
    }
    public void cancelar() {
        estadoActual.cancelar(this);
    }
}