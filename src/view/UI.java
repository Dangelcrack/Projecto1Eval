package view;

import java.util.Scanner;

public class UI {
    public static String readString(String msg) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print(msg);
            input = scanner.next();
            if (!input.matches("[a-zA-Z]+")) {
                System.out.println("Por favor, solo introduce letras.");
                scanner.nextLine(); // consume entire line of invalid input
            } else if ("IA".equals(input)) {
                System.out.println("Por favor no te llames IA");
            } else {
                break;
            }
        }

        return input;
    }

    public static String readDeck(String msg) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print(msg);

            input = scanner.next();

            if (input.equalsIgnoreCase("French") || input.equalsIgnoreCase("Spanish")) {
                break;
            } else {
                System.out.println("Por favor, introduce French o Spanish.");
            }
        }

        return input;
    }

    public static int readInt(String msg, int min, int max) {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(msg);
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
            }
            if (input < min || input > max) {
                System.out.println("Por favor, ingresa un número válido.");
            }

        } while (input < min || input > max);

        scanner.nextLine(); // Consumir el salto de línea pendiente
        return input;
    }
}