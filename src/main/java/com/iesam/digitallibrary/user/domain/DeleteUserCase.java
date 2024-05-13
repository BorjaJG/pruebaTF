package com.iesam.digitallibrary.user.domain;

public class DeleteUserCase {

    public UserRepository userRepository;

    public DeleteUserCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void execute(String userId) {
        this.userRepository.delete(userId);
    }
}
