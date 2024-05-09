package com.iesam.digitallibrary;


import com.iesam.digitallibrary.digitalresources.book.presentation.BookPresentation;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.presentation.UserPresentation;

import java.util.*;

import static com.iesam.digitallibrary.user.presentation.UserPresentation.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        showMainMenu();
    }

    public static void showMainMenu() {
        while (true) {
            System.out.println("\nBienvenido al sistema de gestión de la biblioteca");
            System.out.println("----------------------------------");
            System.out.println("|  1. Menú de Libros              |");
            System.out.println("|  2. Menú de Usuarios            |");
            System.out.println("|  3. Salir                       |");
            System.out.println("----------------------------------");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    BookPresentation.showMenu();
                    break;
                case 2:
                    UserPresentation.showMenu();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor seleccione una opción válida.");
            }
        }
    }


}
