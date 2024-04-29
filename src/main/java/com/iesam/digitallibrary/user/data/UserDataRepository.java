package com.iesam.digitallibrary.user.data;

import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserDataRepository implements UserRepository {

    private final UserFileLocalDataSource userFileLocalDataSource = new UserFileLocalDataSource();
    private static UserRepository instance = null;

    public UserDataRepository() {
        // Private constructor to prevent instantiation outside this class
    }

    public static UserRepository newInstance() {
        if (instance == null) {
            instance = new UserDataRepository();
        }
        return instance;
    }

    @Override
    public boolean save(User user) {
        return userFileLocalDataSource.save(user);
    }

    @Override
    public ArrayList<User> list() {
        return userFileLocalDataSource.findAll();
    }

    @Override
    public User obtain(String userId) {
        return userFileLocalDataSource.findById(userId);
    }
}




