package com.iesam.digitallibrary.loan.presentation;

import com.iesam.digitallibrary.digitalresources.data.DigitalResourceDataRepository;
import com.iesam.digitallibrary.digitalresources.data.local.DigitalResourcesFileLocalDataSource;
import com.iesam.digitallibrary.digitalresources.domain.DigitalResource;
import com.iesam.digitallibrary.digitalresources.domain.book.domain.Book;
import com.iesam.digitallibrary.digitalresources.domain.book.presentation.BookPresentation;
import com.iesam.digitallibrary.digitalresources.presentation.DigitalResourcesPresentation;
import com.iesam.digitallibrary.loan.data.LoanDataRepository;
import com.iesam.digitallibrary.loan.data.local.LoanFileLocalDataSource;
import com.iesam.digitallibrary.loan.domain.Loan;
import com.iesam.digitallibrary.user.data.UserDataRepository;
import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.presentation.UserPresentation;

import java.util.List;
import java.util.Scanner;

public class LoanPresentation {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        scanner.close();
    }

    public static void showMenu() {
        while (true) {
            menuConsolaLoan();

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addLoan();
                    break;
                case 2:
                case 3:
                    deleteLoan();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public  static  void menuConsolaLoan(){
        System.out.println("\nBienvenido al sistema de la biblioteca");
        System.out.println("----------------------------------");
        System.out.println("|     User Management System     |");
        System.out.println("----------------------------------");
        System.out.println("|  Options:                      |");
        System.out.println("|  1. Add Loan                   |");
        System.out.println("|  2. Modify Loan                |");
        System.out.println("|  3. Delete Loan                |");
        System.out.println("|  4. Search Loan                |");
        System.out.println("|  5. List All Loans             |");
        System.out.println("|  6. Exit                       |");
        System.out.println("----------------------------------");
        System.out.print("Select an option: ");
    }
    public static void saveLoan(Loan loan) {
        LoanDataRepository loanRepository = new LoanDataRepository(new LoanFileLocalDataSource());
        loanRepository.save(loan);
        System.out.println("Loan saved successfully.");

    }
    public static void addLoan() {
        Loan loan = readLoanDetails();
        if (loan != null) {
            saveLoan(loan);
        }
    }
    public static Loan readLoanDetails() {
        System.out.println("Enter Loan Information:");
        System.out.print("idLoan: ");
        String idLoan= scanner.nextLine();
        System.out.print("fechaI: ");
        String fechaI = scanner.nextLine();
        System.out.print("fechaF: ");
        String fechaF = scanner.nextLine();
        System.out.print("fechaE: ");
        String fechaE = scanner.nextLine();
        System.out.print("User: ");
        User user = UserPresentation.searchUser();
        System.out.print("DigitalResource: ");
        DigitalResource digitalResource = DigitalResourcesPresentation.searchDG();

        return new Loan(idLoan, digitalResource ,user,fechaI, fechaF, fechaE);

    }

    public static void deleteLoanById(String idLoan) {
        LoanDataRepository loanRepository = new LoanDataRepository(new LoanFileLocalDataSource());
        loanRepository.delete(idLoan);
        System.out.println("Loan deleted successfully.");
    }


    public static void deleteLoan() {
        System.out.print("Enter Loan ID to delete: ");
        String idLoan = scanner.nextLine();
        if (!idLoan.isEmpty()) {
            deleteLoanById(idLoan);
        } else {
            System.out.println("Invalid Loan ID.");
        }
    }

}
