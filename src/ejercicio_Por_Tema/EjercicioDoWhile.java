package ejercicio_Por_Tema;

public class EjercicioDoWhile {

    static void main(String[] args) {
        double montoApertura = -500;

        do{
            System.out.println("Intentando abrir caja con monto: $" + montoApertura);

            montoApertura = 15000;

        } while (montoApertura <= 0);
        System.out.println("!Caja abierta! con un monto: $" + montoApertura);
    }
}
