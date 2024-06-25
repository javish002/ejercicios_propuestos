/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Determinar y mostrar cuál número es mayor
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close();
    }
}
