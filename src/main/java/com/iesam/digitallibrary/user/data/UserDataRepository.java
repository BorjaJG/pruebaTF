package com.iesam.digitallibrary.user.data;

import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.data.local.UserMemLocalDataSource;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {


    private UserFileLocalDataSource userFileLocalDataSource;


    @Override
    public void save(User user) {

       this.userFileLocalDataSource.save(user);

    }
}
