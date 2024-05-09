package com.iesam.digitallibrary.user.data.local;

import com.iesam.digitallibrary.user.domain.User;

import java.util.ArrayList;

public interface UserLocalDataSource {


    boolean save(User user);
    void delete(String id);
    void modify(User user);
    ArrayList<User> findAll();
    User findById(String userId);





}
