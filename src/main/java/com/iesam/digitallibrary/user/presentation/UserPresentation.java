package com.iesam.digitallibrary.user.presentation;

import com.iesam.digitallibrary.user.data.UserDataRepository;
import com.iesam.digitallibrary.user.domain.NewUserUseCase;
import com.iesam.digitallibrary.user.domain.User;

public class UserPresentation {


    public static void saveUser(User user){
        NewUserUseCase newUserUseCase = new NewUserUseCase(new UserDataRepository());
        newUserUseCase.execute(user);
        System.out.println(user.toStringCarnet());
    }


}
