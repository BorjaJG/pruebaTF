package com.iesam.digitallibrary.user.newUser.data;

import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;

public class Stun1UserDataRepository implements UserRepository {
    @Override
    public boolean save(User user) {

        return false;
    }
}