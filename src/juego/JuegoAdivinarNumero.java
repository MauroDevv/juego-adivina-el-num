package juego;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {

    private int numeroSecreto;
    private final int intentosMaximos = 5;
    private final int rangoMinimo = 1;
    private final int rangoMaximo = 100;

    public void iniciarJuego() {
        generarNumeroSecreto();
        System.out.println("¡Bienvenido al juego! Tienes que adivinar el número secreto.");
        System.out.println("Estoy pensando en un número entre " + rangoMinimo + " y " + rangoMaximo + ".");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinar.");

        Scanner scanner = new Scanner(System.in);
        boolean adivina = false;

        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.print("Intento " + intento + ": ¿Cuál es el número? ");

            // Validación para ingresar un numero
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Ingrese un número entero:");
                scanner.next(); // para limpiar la entrada incorrecta
            }

            int intentoUsuario = scanner.nextInt();

            if (intentoUsuario == numeroSecreto) {
                System.out.println("¡Victoria! Adivinaste el número en " + intento + " intentos.");
                adivina = true;
                break;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.println("Demasiado alto.");
            }
        }

        if (!adivina) {
        	System.out.println("¡Derrota!");
            System.out.println("No lograste adivinar el número.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }
    }

    private void generarNumeroSecreto() {
        Random random = new Random();
        numeroSecreto = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
    }
}