package juego;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        JuegoAdivinarNumero juego = new JuegoAdivinarNumero();

        int opcion;
        do {
            System.out.println("--- MENÚ: ADIVINA EL NÚMERO ---");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Escoge una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    juego.iniciarJuego();
                    break;
                case 2:
                    System.out.println("Saliendo del juego ... ¡Gracias por jugar! ");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 2);
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}