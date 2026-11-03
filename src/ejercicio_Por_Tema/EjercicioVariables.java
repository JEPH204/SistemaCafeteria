package ejercicio_Por_Tema;

public class EjercicioVariables {

    static void main(String[] args) {
        String nombreProducto = "Papitas";
        double precioUnitario = 3500;
        int cantidadEnInventario = 5;
        boolean estaDisponibleHoy = true;
        char codigoProducto = 'A';

        System.out.printf("Nombre del prodcuto: %s%n", nombreProducto.toUpperCase());
        System.out.printf("Precio unitario: $%.2f%n", precioUnitario);
        System.out.printf("Cantidad en inventario: %d%n", cantidadEnInventario);
        System.out.printf("Disponible hoy: %b%n", estaDisponibleHoy);
        System.out.printf("Código del producto: %c%n", codigoProducto);
    }
}
