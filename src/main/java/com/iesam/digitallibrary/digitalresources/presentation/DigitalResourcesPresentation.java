package com.iesam.digitallibrary.digitalresources.presentation;

import com.iesam.digitallibrary.digitalresources.data.DigitalResourceDataRepository;
import com.iesam.digitallibrary.digitalresources.data.local.DigitalResourcesFileLocalDataSource;import com.iesam.digitallibrary.digitalresources.data.local.DigitalResourcesLocalDataSource;
import com.iesam.digitallibrary.digitalresources.domain.DigitalResource;

import com.iesam.digitallibrary.digitalresources.domain.book.presentation.BookPresentation;


import java.util.List;
import java.util.Scanner;

public class DigitalResourcesPresentation {


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
                    BookPresentation.showMenu();
                    break;
                case 2:
                    listRecurseDigital();
                    break;
                case 3:
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void menuConsoleBook() {
        System.out.println("\nWelcome to the Book Presentation Management System");
        System.out.println("-----------------------------------------------");
        System.out.println("|               Options:                      |");
        System.out.println("|  1. Presentation Book                       |");
        System.out.println("|  2. List Recurse Digital                    |");
        System.out.println("|  4. Exit                                    |");
        System.out.println("-----------------------------------------------");
        System.out.print("Select an option: ");
    }
    public static DigitalResource searchDG() {
        System.out.print("Enter Digital Resource ID to search: ");
        String idDigitalResource = scanner.nextLine();
        DigitalResource digitalResource = getUserById(idDigitalResource);
        if (digitalResource != null) {
            System.out.println("DigitalResource found:");
            System.out.println(digitalResource);
        } else {
            System.out.println("DigitalResource not found with ID: " + idDigitalResource);
        }
        return digitalResource;
    }

    public static void listRecurseDigital() {
        List<DigitalResource> digitalResources = getAllRecurseDigital();
        System.out.println("List of Digital Recurses:");
        for (DigitalResource digitalResource : digitalResources) {
            System.out.println(digitalResource);
        }
    }

    public static List<DigitalResource> getAllRecurseDigital() {
        DigitalResourceDataRepository digitalResourceRepository = new DigitalResourceDataRepository(new DigitalResourcesFileLocalDataSource());
        return digitalResourceRepository.list();
    }
    public static DigitalResource getUserById(String idDigitalResource) {
        DigitalResourceDataRepository digitalResourceRepository  = new DigitalResourceDataRepository(new DigitalResourcesFileLocalDataSource());
        return digitalResourceRepository.listDR(idDigitalResource);
    }

}
