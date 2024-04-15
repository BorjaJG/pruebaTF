package com.iesam.digitallibrary.user.data;

import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {


    UserFileLocalDataSource userFileLocalDataSource = new UserFileLocalDataSource();

    @Override
    public void save(User user) {

       this.userFileLocalDataSource.save(user);

    }
}
