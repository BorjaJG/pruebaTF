package com.iesam.digitallibrary.user.newUser.data;

import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;

import java.util.ArrayList;

public class Stun1UserDataRepository implements UserRepository {
    @Override
    public boolean save(User user) {

        return false;
    }

    @Override
    public  User obtain(String userId) {
        return null;
    }

    @Override
    public ArrayList<User> list() {
        return null;
    }

    @Override
    public void delete(String userId) {

        this.delete(null);

    }

    @Override
    public void modify(User user) {
        this.modify(user);
    }


}
