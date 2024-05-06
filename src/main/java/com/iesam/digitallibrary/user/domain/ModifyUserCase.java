package com.iesam.digitallibrary.user.domain;

public class ModifyUserCase {

    private UserRepository userRepository;

    public ModifyUserCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void modify(User user){
        userRepository.modify(user);
    }
}
