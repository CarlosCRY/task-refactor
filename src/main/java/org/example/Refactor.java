package org.example;


import java.util.Scanner;

public class Refactor {
    // Refactorizacion: refactor -> Refactor

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                int n;
                // Refactorizacion: chisme -> n
                do {
                    System.out.print("Introduce un entero positivo: ");
                    n = scanner.nextInt();
                    scanner.nextLine();
                } while (n <= 0);

                int sum = 0;
                // Refactorización: La_suma -> sum
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }

                System.out.println("El sumatorio es " + sum);
            } else if (option == 2) {
                int amount;
                // Refactorizacion: -zzzz -> amount
                do {
                    System.out.print("Introduce un entero positivo: ");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                } while (amount <= 0);

                int sum = 0;
                // Nota: podriamos cambiar "sum" debido a que existe una variable tipada con
                // el mismo nominador. Pero existen en diferentes ambitos, por lo que no es necesario.
                for (int i = 0; i < amount; i++) {
                    // Refactorizacion: cosa -> i
                    System.out.print("Introduce un número:");
                    sum += scanner.nextInt();
                    scanner.nextLine();
                }

                System.out.println("La media es " + (sum / amount));
            } else if (option == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }

        } while (option != 3);
    }
}
// Codigo formateado