package com.iesam.digitallibrary.user.domain;

import java.util.ArrayList;

public class GetUsersUseCase {
    public UserRepository userRepository;

    public GetUsersUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public ArrayList<User> obtenerlistado(){
        return userRepository.list();
    }
}
