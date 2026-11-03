package ejercicio_Por_Tema;

public class EjercicioOperadores {

    static void main(String[] args) {
        double subtotal = 42500;

        boolean tieneDescuento = subtotal > 30000;
        double valorDescuento = subtotal * 0.15 ;
        double totalPago = subtotal - valorDescuento;

        System.out.printf("Valor del descuento: $%,.2f%n", valorDescuento);
        System.out.printf("Total a pagar: $%,.2f%n", totalPago);
        System.out.printf("Aplica el desceunto? : %b%n", tieneDescuento);
    }
}
