/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_7;

/**
 *
 * @author PC_1
 */
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingrese el primer número (entre 75 y 250): ");
        int numero1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número (entre 75 y 250): ");
        int numero2 = scanner.nextInt();

        // Verificar si ambos números están en el rango
        if (numero1 >= 75 && numero1 <= 250 && numero2 >= 75 && numero2 <= 250) {
            // Calcular la suma
            int suma = numero1 + numero2;
            // Mostrar la suma
            System.out.println("La suma de los dos números es: " + suma);
        } else {
            // Mostrar mensaje de error
            System.out.println("Ambos números deben estar entre 75 y 250.");
        }

        scanner.close();
    }
}

