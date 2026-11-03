package ejercicio_Por_Tema;

public class EjercicioSwitch {

    static void main(String[] args) {

        char categoria = 'C';
        double precioBase = 15500;

        double porcetajeIva = switch (categoria) {
            case 'B' -> 0;
            case 'F' -> 0.05;
            case 'C', 'P' -> 0.08;
            default -> 0;
        };

        double valorConIva = precioBase * porcetajeIva;
        double precioTotalConIva = precioBase +valorConIva;
        System.out.printf("Valor del IVA: $%,.2f%n", valorConIva );
        System.out.printf("Valor total a pagar: $%,.2f%n", precioTotalConIva );
    }
}
