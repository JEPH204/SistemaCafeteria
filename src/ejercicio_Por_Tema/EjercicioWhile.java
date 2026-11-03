package ejercicio_Por_Tema;

public class EjercicioWhile {

    static void main(String[] args) {
        int inventario = 50;
        int numeroPedido = 1;
        int consumoPorPedido = 2;

        while (inventario > 10) {
            inventario -= consumoPorPedido;
            System.out.printf("Pedido %d: Se pidieron %d unidades. Quedan %d en inventario.%n", numeroPedido, consumoPorPedido, inventario);
            numeroPedido++;
        }
    }
}
