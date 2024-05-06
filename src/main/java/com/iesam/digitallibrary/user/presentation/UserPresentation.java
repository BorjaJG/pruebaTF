package com.iesam.digitallibrary.user.presentation;

import com.iesam.digitallibrary.user.data.UserDataRepository;
import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.domain.ModifyUserCase;
import com.iesam.digitallibrary.user.domain.User;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserPresentation {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        scanner.close();
    }

    public static void showMenu() {
        while (true) {

            menuConsola();

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    modifyUser();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    searchUser();
                    break;
                case 5:
                    listAllUsers();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void addUser() {
        User user = readUserDetails();
        if (user != null) {
            saveUser(user);
        }
    }

    public static User readUserDetails() {
        System.out.println("Enter User Information:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Role ID: ");
        String roleId = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Registration Date: ");
        String registrationDate = scanner.nextLine();

        System.out.print("Status: ");
        String status = scanner.nextLine();

        System.out.print("History: ");
        String history = scanner.nextLine();

        System.out.print("Fines: ");
        String fines = scanner.nextLine();

        System.out.print("Transactions: ");
        String transactions = scanner.nextLine();

        System.out.print("Notification Preference: ");
        String notificationPreference = scanner.nextLine();

        System.out.print("User Type: ");
        String userType = scanner.nextLine();

        System.out.print("Additional Data: ");
        String additionalData = scanner.nextLine();

        return new User(id, name, email, phoneNumber, address, registrationDate, userType, status,
                history, fines, transactions, notificationPreference, roleId, additionalData);
    }

    public static void modifyUser() {

        User user = readUserDetails();
        if (user != null) {
            modifyUser(user);
        }


    }

    public static void deleteUser() {
        System.out.print("Enter User ID to delete: ");
        String userId = scanner.nextLine();
        if (!userId.isEmpty()) {
            deleteUserById(userId);
        } else {
            System.out.println("Invalid user ID.");
        }
    }

    public static void searchUser() {
        System.out.print("Enter User ID to search: ");
        String userId = scanner.nextLine();
        User user = getUserById(userId);
        if (user != null) {
            System.out.println("User found:");
            System.out.println(user);
        } else {
            System.out.println("User not found with ID: " + userId);
        }
    }

    public static void listAllUsers() {
        List<User> users = getAllUsers();
        System.out.println("List of Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public static void saveUser(User user) {
        UserDataRepository userRepository = new UserDataRepository(new UserFileLocalDataSource());
        userRepository.save(user);
        System.out.println("User saved successfully.");
    }

    public static User getUserById(String userId) {
        UserDataRepository userRepository = new UserDataRepository(new UserFileLocalDataSource());
        return userRepository.obtain(userId);
    }

    public static List<User> getAllUsers() {
        UserDataRepository userRepository = new UserDataRepository(new UserFileLocalDataSource());
        return userRepository.list();
    }

    public static void deleteUserById(String userId) {
        UserDataRepository userRepository = new UserDataRepository(new UserFileLocalDataSource());
        userRepository.delete(userId);
        System.out.println("User deleted successfully.");
    }
    public  static  void menuConsola(){
        System.out.println("\nBienvenido al sistema de la biblioteca");
        System.out.println("----------------------------------");
        System.out.println("|     User Management System     |");
        System.out.println("----------------------------------");
        System.out.println("|  Options:                      |");
        System.out.println("|  1. Add User                   |");
        System.out.println("|  2. Modify User                |");
        System.out.println("|  3. Delete User                |");
        System.out.println("|  4. Search User                |");
        System.out.println("|  5. List All Users             |");
        System.out.println("|  6. Exit                       |");
        System.out.println("----------------------------------");
        System.out.print("Select an option: ");
    }
    private static void modifyUser(User user){
        UserDataRepository userRepository= new UserDataRepository(new UserFileLocalDataSource());
        userRepository.modify(user);
    }


}
