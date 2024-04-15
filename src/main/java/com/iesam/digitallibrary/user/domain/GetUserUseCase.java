package com.iesam.digitallibrary.user.domain;

public class GetUserUseCase {

    private UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User execute(String userId){
        return this.userRepository.obtain(userId);
    }

}
