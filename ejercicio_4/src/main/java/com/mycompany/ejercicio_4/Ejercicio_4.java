/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de la temperatura
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();

        // Verificar si la temperatura es mayor o igual a 150
        if (temperatura >= 150) {
            System.out.println("ALERTA");
        } else {
            System.out.println("Temperatura normal");
        }

        scanner.close();
    }
}

