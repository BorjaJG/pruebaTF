package com.iesam.digitallibrary.user.domain;

public class User {


    /*
       Los atributos incluyen la identificación del usuario, su nombre, correo electrónico, número de teléfono,
       dirección, fecha de registro, tipo de usuario, estado de la cuenta, historial de préstamos, multas,
       historial de transacciones, preferencias de notificación, rol de usuario y datos adicionales.
       Estos son datos clave para gestionar la información del usuario en el sistema.
     */

    private final String userID;
    private final String name;
    private final String email;
    private final String  phoneNumber;
    private final String address;
    private final String registrationDate;
    private final String userType;
    private final String accountStatus;
    private final String loanHistory;
    private final String fines;
    private final String transactionHistory;
    private final String notificationPreferences;
    private final String userRole;
    private final String additionalData;

    public User(String userID, String name, String email, String phoneNumber,
                            String address, String registrationDate, String userType, String accountStatus,
                            String loanHistory, String fines, String transactionHistory,
                            String notificationPreferences,String userRole, String additionalData) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registrationDate = registrationDate;
        this.userType = userType;
        this.accountStatus = accountStatus;
        this.loanHistory = loanHistory;
        this.fines = fines;
        this.transactionHistory = transactionHistory;
        this.notificationPreferences = notificationPreferences;
        this.userRole = userRole;
        this.additionalData = additionalData;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public String getUserType() {
        return userType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public String getLoanHistory() {
        return loanHistory;
    }

    public String getFines() {
        return fines;
    }

    public String getTransactionHistory() {
        return transactionHistory;
    }

    public String getNotificationPreferences() {
        return notificationPreferences;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    @Override
    public String toString() {
        return "UserPresentation{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", userType='" + userType + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", loanHistory='" + loanHistory + '\'' +
                ", fines='" + fines + '\'' +
                ", transactionHistory='" + transactionHistory + '\'' +
                ", notificationPreferences='" + notificationPreferences + '\'' +
                ", userRole='" + userRole + '\'' +
                ", additionalData='" + additionalData + '\'' +
                '}';
    }

}
