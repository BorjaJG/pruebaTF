package com.iesam.digitallibrary.user.domain;

public interface UserRepository {


    boolean save(User user);


    User obtain(String userId);
}
