void main() {
    // --- TAREA 4: Apertura de turno ---
    double montoApertura = -500;
    do {
        if (montoApertura <= 0) {
            montoApertura = 50000;
        }
    } while (montoApertura <= 0);

    // --- TAREA 1: Datos base ---
    String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
    double[] precios = {3500, 5000, 4000, 4500, 6000};
    char[] categorias = {'B', 'B', 'F', 'C', 'P'};
    int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
    int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};

    // Variables de control para la Tarea 5 (Reporte de cierre)
    int totalPedidosProcesados = 0;
    double totalRecaudado = 0;
    double mayorValorPedido = 0;
    int numeroPedidoMayor = 0;

    // TAREA 3 Inventario inicial de Brownies
    int inventarioBrownie = 10;

    // Recorremos los 6 pedidos con el for
    for (int i = 0; i < pedidoProducto.length; i++) {
        int indiceProducto = pedidoProducto[i];
        String producto = nombres[indiceProducto];
        double precio = precios[indiceProducto];
        char categoriaLetra = categorias[indiceProducto];
        int cantidad = pedidoCantidad[i];

        String descripcionCategoria = "";
        switch (categoriaLetra) {
            case 'B':
                descripcionCategoria = "Bebida Caliente";
                break;
            case 'F':
                descripcionCategoria = "Bebida Fria";
                break;
            case 'C':
                descripcionCategoria = "Comida";
                break;
            case 'P':
                descripcionCategoria = "Postre";
                break;
            default:
                descripcionCategoria = "Desconocido";
                break;
        }

        double subtotal = 0;
        double totalFinal = 0;
        String mensajeEstado = "";

        // --- TAREA 3 Validación de inventario para el Brownie ---
        if (indiceProducto == 4) {
            if (cantidad <= inventarioBrownie) {
                // Sí hay stock, descontamos del inventario y calculamos normal
                inventarioBrownie -= cantidad;
                subtotal = precio * cantidad;
                totalFinal = subtotal;
                mensajeEstado = "OK";
                totalPedidosProcesados++;
            } else {
                // No hay suficiente stock: producto agotado, no se cobra
                System.out.printf("Pedido %d: %s - ¡PRODUCTO AGOTADO!",
                        (i + 1), producto, inventarioBrownie);
                continue;
            }
        } else {
            // Para cualquier otro producto que no sea Brownie
            subtotal = precio * cantidad;
            totalFinal = subtotal;
            mensajeEstado = "Sin descuento";
            totalPedidosProcesados++;
        }

        // --- TAREA 2 descuento si supera $12.000 ---
        if (totalFinal > 12000) {
            double descuento = totalFinal * 0.10;
            totalFinal = totalFinal - descuento;
            mensajeEstado = "Aplica 10% descuento";
        }

        // Acumulamos la recaudación total
        totalRecaudado += totalFinal;

        // Validamos si este pedido es el de mayor valor
        if (totalFinal > mayorValorPedido) {
            mayorValorPedido = totalFinal;
            numeroPedidoMayor = (i + 1);
        }

        // Imprimimos el detalle del pedido
        System.out.printf("Pedido %d: %s | Cantidad: %d | Categoría: %s | Subtotal: $%,.2f | %s | Total: $%,.2f%n",
                (i + 1), producto, cantidad, descripcionCategoria, subtotal, mensajeEstado, totalFinal);
    }

    // --- TAREA 5 reporte de cierre ---
    System.out.println("Monto inicial en caja: $" + montoApertura);
    System.out.println("Total de pedidos procesados: " + totalPedidosProcesados);
    System.out.printf("Total recaudado: $%,.2f%n", totalRecaudado);
    System.out.println("El pedido con mayor valor fue el Pedido #" + numeroPedidoMayor + " con un total de: $" + mayorValorPedido);
}