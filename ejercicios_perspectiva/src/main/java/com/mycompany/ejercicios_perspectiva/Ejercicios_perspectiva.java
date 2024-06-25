/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios_perspectiva;

import java.util.Scanner;

public class Ejercicios_perspectiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar cantidad de unidades y precio unitario
        System.out.print("Ingrese la cantidad de unidades a comprar: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio unitario del producto: ");
        double precioUnitario = scanner.nextDouble();

        // Calcular monto de la compra sin descuentos ni obsequios
        double montoCompra = cantidad * precioUnitario;

        // Inicializar variables de descuento y monto final
        double montoDescuento = 0;
        double montoAPagar = montoCompra;

        // Verificar si aplica descuento y obsequio
        if (cantidad > 36) {
            // Calcular el descuento del 22%
            montoDescuento = montoCompra * 0.22;
            // Calcular monto a pagar con descuento
            montoAPagar = montoCompra - montoDescuento;
            // Agregar una unidad adicional sin costo
            cantidad += 1;
        }

        // Mostrar resultados
        System.out.println("Monto de la compra sin descuento: $" + montoCompra);
        System.out.println("Monto del descuento: $" + montoDescuento);
        System.out.println("Monto a pagar: $" + montoAPagar);
        System.out.println("Cantidad total de unidades (incluyendo obsequio): " + cantidad);

        scanner.close();
    }
}
 