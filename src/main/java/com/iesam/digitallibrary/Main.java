package com.iesam.digitallibrary;


import com.iesam.digitallibrary.user.domain.User;

import com.iesam.digitallibrary.user.presentation.UserPresentation;

public class Main {

    public static void main(String[] arg){
        UserPresentation.saveUser(new User("1", "3", "email@example.com",
                "123456789", "123 Street Ave", "2024-04-15",
                "Regular", "Active", "No history", "No fines",
                "No transactions", "Email", "User",
                "Additional data"));
    }



}
