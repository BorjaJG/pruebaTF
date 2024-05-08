package com.iesam.digitallibrary.digitalresources.book.presentation;

import com.iesam.digitallibrary.digitalresources.book.domain.Book;

import java.util.Scanner;

public class BookPresentation {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        scanner.close();
    }

    public static void showMenu() {
        while (true) {
            menuConsole();

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addPresentation();
                    break;
                case 2:
                    modifyPresentation();
                    break;
                case 3:
                    deletePresentation();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void addPresentation() {



    }

    public static Book readPresentationDetails() {
        System.out.println("Enter Presentation Information:");
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Publication Date: ");
        String publicationDate = scanner.nextLine();

        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        return new Book(title, author, publicationDate, isbn);
    }

    public static void modifyPresentation() {
        book = readPresentationDetails();
        if (book != null) {
            modifyPresentation();
        }
    }

    public static void deletePresentation() {
        System.out.print("Enter ISBN of the Presentation to delete: ");
        String isbn = scanner.nextLine();
        if (!isbn.isEmpty()) {
            deletePresentationByISBN(isbn);
        } else {
            System.out.println("Invalid ISBN.");
        }
    }

    public static void savePresentation(BookPresentation presentation) {
        // Aquí implementa la lógica para guardar la presentación en una fuente de datos (por ejemplo, archivo).
        System.out.println("Presentation saved successfully.");
    }


    public static void deletePresentationByISBN(String isbn) {
        // Aquí implementa la lógica para eliminar una presentación por su ISBN.
        System.out.println("Presentation deleted successfully.");
    }

    public static void menuConsole() {
        System.out.println("\nWelcome to the Book Presentation Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("|               Options:                      |");
        System.out.println("|  1. Add Presentation                        |");
        System.out.println("|  2. Modify Presentation                     |");
        System.out.println("|  3. Delete Presentation                     |");
        System.out.println("|  4. Exit                                    |");
        System.out.println("-----------------------------------------------");
        System.out.print("Select an option: ");
    }
}



