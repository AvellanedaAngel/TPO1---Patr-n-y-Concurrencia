import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class MainSistemaPedidos { 
    public static void main(String [] args){
        // Crear lista de pedidos
        List<Pedido> pedidos = new ArrayList<>(); 
        //Solicitar al usuario la cantidad de pedidos a crear
        System.out.println("Ingrese la cantidad de pedidos a crear");
        int cantidadPedidos = new java.util.Scanner(System.in).nextInt();

        for(int i = 1; i <= cantidadPedidos; i++){
            pedidos.add(new Pedido(i));
        }

        // Crear un ForkJoinPool utilizando hilos disponibles en el sistema
        ForkJoinPool pool = new ForkJoinPool();

        System.out.println("[PRIMER FLUJO]: Pasar de Nuevo a Pagado");
        ProcesadorPedidos proceso1 = new ProcesadorPedidos(pedidos);
        pool.invoke(proceso1);

        System.out.println("[SEGUNDO FLUJO]: Pasar de Pagado a Enviado");
        ProcesadorPedidos proceso2 = new ProcesadorPedidos(pedidos);
        pool.invoke(proceso2);

        System.out.println("[TERCER FLUJO]: Pasar de Enviado a Entregado");
        ProcesadorPedidos proceso3 = new ProcesadorPedidos(pedidos);
        pool.invoke(proceso3);

        //System.out.println("[CUARTO FLUJO]: Cancelar pedidos");

        //Cerrar el ForkJoinPool
        pool.close(); 
        
    }
}