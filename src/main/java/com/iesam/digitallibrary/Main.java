package com.iesam.digitallibrary;


import com.iesam.digitallibrary.user.domain.User;

import java.util.*;


import static com.iesam.digitallibrary.user.presentation.UserPresentation.getUser;
import static com.iesam.digitallibrary.user.presentation.UserPresentation.saveUser;

public class Main {
    static ArrayList<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        loadInitialData();
        showMenu();
    }

    public static void loadInitialData() {
        // Cargar datos iniciales de usuarios
        users.add(new User("1", "3", "email@example.com", "123456789", "123 Street Ave", "2024-04-15", "Regular", "Active", "No history", "No fines", "No transactions", "Email", "User", "Null"));
        users.add(new User("2", "3", "email@example.com", "123456789", "123 Street Ave", "2024-04-15", "Regular", "Active", "No history", "No fines", "No transactions", "Email", "User", "Null"));
    }

    public static void showMenu() {
        while (true) {
            System.out.println("\n----------------------------------");
            System.out.println("|     User Management System     |");
            System.out.println("----------------------------------");
            System.out.println("|  Options:                      |");
            System.out.println("|                                |");
            System.out.println("|  1. Add User                   |");
            System.out.println("|  2. Modify User                |");
            System.out.println("|  3. Delete User                |");
            System.out.println("|  4. Search User                |");
            System.out.println("|  5. List All Users             |");
            System.out.println("|  6. Exit                       |");
            System.out.println("----------------------------------");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

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

        System.out.println("Enter User Information:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

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

        // Crear un objeto User con los datos ingresados
        User user = new User(id, nombre, email, phoneNumber, address, registrationDate, userType, status, history, fines, transactions, notificationPreference, roleId, additionalData);

        // Llamar al método para guardar el usuario
        saveUser(user);


    }

    public static void modifyUser() {
        // Implementar la lógica para modificar un usuario
    }

    public static void deleteUser() {
        // Implementar la lógica para eliminar un usuario
    }

    public static void searchUser() {
        // Solicitar la ID del usuario al usuario
        System.out.println("Por favor, introduce la ID del usuario:");
        String userId = scanner.nextLine();

        // Obtener el usuario utilizando la ID proporcionada
        User user = getUser(userId);

        // Verificar si se encontró algún usuario con la ID proporcionada
        if (user == null) {
            // Si no se encontró ningún usuario, mostrar un mensaje informativo
            System.out.println("Lo siento, no se encontró ningún usuario con la ID: " + userId);
        } else {
            // Si se encontró un usuario, mostrar su información
            System.out.println("¡Usuario encontrado con la ID " + userId + ":");
            System.out.println(user.toStringCarnet());
            System.out.println("¡Adios");
        }

    }

    public static void listAllUsers() {
        System.out.println("List of Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }


}
