package org.example;


import java.util.Scanner;

public class Refactor {
    // Refactorizacion: refactor -> Refactor
    public static final Scanner scanner = new Scanner(System.in);
    // Refactorizacion: SCANNER -> scanner; Para mantener las convenciones de la clase/profesor

    public static void main(String[] args) {
        // scanner convertido en constante.
        int option;
        // Refactorizacion: Opt -> option
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Sumatorio");
            System.out.println("2. Media");
            System.out.println("3. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                summatory();
                // Convertido en metodo "summatory".
            } else if (option == 2) {
                mediam();
                // Convertido en metodo "mediam"
            } else if (option == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }

        } while (option != 3);
    }

    private static void summatory() {
        int n = getN();
        // Convertido en metodo "getN"
        int sum = 0;
        // Refactorización: La_suma -> sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("El sumatorio es " + sum);
    }

    private static void mediam() {
        int amount = getN();
        // Refactorizacion: _zzzz -> amount
        // Asociado con el metodo "getN" convertido en el metodo anterior.

        int sum = 0;
        // Nota: podriamos cambiar "sum" debido a que existe una variable tipada con
        // el mismo nominador. Pero existen en diferentes ambitos, por lo que no es necesario.
        for (int i = 0; i < amount; i++) {
            // Refactorizacion: cosa -> i
            System.out.print("Introduce un número:");
            sum += scanner.nextInt();
            scanner.nextLine();
        }

        int result = sum / amount;
        System.out.println("La media es " + result);
        // Convertido en variable "result".
    }
    private static int getN() {
        int n;
        // Refactorizacion: chisme -> n
        do {
            System.out.print("Introduce un entero positivo: ");
            n = scanner.nextInt();
            scanner.nextLine();
        } while (n <= 0);
        return n;
    }
}
// Codigo formateado