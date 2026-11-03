package ejercicio_Por_Tema;

public class EjercicioForyArrays {

    static void main(String[] args) {

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        double precioTotalMenu = 0;

        for (int i = 0; i < productos.length; i++) {
            String producto = productos[i];
            double precio = precios[i];

            System.out.printf("%d. %s - $%,.2f%n", (i + 1), producto, precio);

            precioTotalMenu += precio;
        }

        double promedioMenu = precioTotalMenu / precios.length;
        System.out.printf("%nEl precio promedio del menu es: $%,.2f%n", promedioMenu );
    }
}
