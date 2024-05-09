package com.iesam.digitallibrary.digitalresources.book.presentation;

import com.iesam.digitallibrary.digitalresources.book.data.BookDataRepository;
import com.iesam.digitallibrary.digitalresources.book.data.local.BookFileLocalDataSource;
import com.iesam.digitallibrary.digitalresources.book.domain.Book;
import com.iesam.digitallibrary.user.data.UserDataRepository;
import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;


import java.util.Scanner;

public class BookPresentation {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        scanner.close();
    }

    public static void showMenu() {
        while (true) {
           menuConsoleBook();

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addBook();
                    break;
                case 2:
                    modifyBook();
                    break;
                case 3:
                    deleteBook();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void addBook() {
        Book book = readBook();
        if (book != null) {
            saveBook(book);
        }



    }

    public static Book readBook() {
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

    public static void modifyBook() {
       //
    }

    public static void deleteBook() {
        System.out.print("Enter Book isbn to delete: ");
        String isbn = scanner.nextLine();
        if (!isbn.isEmpty()) {
            deleteBookByISBN(isbn);
        } else {
            System.out.println("Invalid book isbn.");
        }
    }

    public static void saveBook(Book book) {
        BookDataRepository bookDataRepository = new BookDataRepository(new BookFileLocalDataSource());
        bookDataRepository.save(book);
        System.out.println("Book saved successfully.");

    }


    public static void deleteBookByISBN(String isbn) {
        BookDataRepository bookDataRepository = new BookDataRepository(new BookFileLocalDataSource());
        bookDataRepository.delete(isbn);
        System.out.println("Presentation deleted successfully.");
    }

    public static void menuConsoleBook() {
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



