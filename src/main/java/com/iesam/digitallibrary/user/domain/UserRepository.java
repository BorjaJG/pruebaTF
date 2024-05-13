package com.iesam.digitallibrary.user.domain;

import java.util.ArrayList;

public interface UserRepository {


    boolean save(User user);


    User obtain(String userId);


    ArrayList<User> list();


    void delete(String userId);
}
