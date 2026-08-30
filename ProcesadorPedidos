import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ProcesadorPedidos extends RecursiveAction {
    private static final int UMBRAL = 5;
    private List<Pedido> pedidos;
    private int inicio;
    private int fin;

    public ProcesadorPedidos(List<Pedido> pedidos, int inicio, int fin) {
        this.pedidos = pedidos;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    protected void compute() {
        int tamanio = fin - inicio;
        if (tamanio <= UMBRAL) {
            //Caso base: Procesamiento directo
            for(int i = inicio; i < fin; i++){
                Pedido pedido = pedidos.get(i);
                System.out.println("[" + Thread.currentThread().getName() + "] Procesando pedido: " + pedido.getId());
                pedido.procesar();
            }
        }else{
            //Caso recursivo: Dividir la tarea 
            int medio = inicio + (tamanio) / 2; 
            ProcesadorPedidos subTarea1 = new ProcesadorPedidos(pedidos, inicio, medio);
            ProcesadorPedidos subTarea2 = new ProcesadorPedidos(pedidos, medio, fin);
            // Ejecutar las sub-tareas en paralelo
            invokeAll(subTarea1, subTarea2);
        }
    }
}