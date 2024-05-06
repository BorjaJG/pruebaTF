package com.iesam.digitallibrary.user.data;

import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.data.local.UserLocalDataSource;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;

import java.util.ArrayList;


public class UserDataRepository implements UserRepository {

     UserLocalDataSource userLocalDataSource;

    public UserDataRepository(UserLocalDataSource userLocalDataSource) {
        this.userLocalDataSource = userLocalDataSource;
    }

    @Override
    public boolean save(User user) {
        return userLocalDataSource.save(user);
    }

    @Override
    public ArrayList<User> list() {
        return userLocalDataSource.findAll();
    }

    @Override
    public void delete(String userId) {
        userLocalDataSource.delete(userId);
    }

    @Override
    public void modify(User user) {
        userLocalDataSource.modify(user);
    }


    @Override
    public User obtain(String userId) {
        return userLocalDataSource.findById(userId);
    }
}




