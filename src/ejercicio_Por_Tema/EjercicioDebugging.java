package ejercicio_Por_Tema;

public class EjercicioDebugging {

    public static void main(String[] args) {
        int cantidadVendida = 5; //se le quita "" pues es un entero no un String
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento) {
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total); }
}
