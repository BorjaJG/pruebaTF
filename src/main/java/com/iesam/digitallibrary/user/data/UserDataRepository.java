package com.iesam.digitallibrary.user.data;

import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {


    UserFileLocalDataSource userFileLocalDataSource = new UserFileLocalDataSource();

    @Override
    public boolean save(User user) {

       this.userFileLocalDataSource.save(user);

        return false;
    }

    @Override
    public User obtain(String userId) {
        return this.userFileLocalDataSource.findById(userId);
    }
}
