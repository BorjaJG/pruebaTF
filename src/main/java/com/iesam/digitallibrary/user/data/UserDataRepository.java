package com.iesam.digitallibrary.user.data;

import com.iesam.digitallibrary.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.domain.UserRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserDataRepository implements UserRepository {

    public UserFileLocalDataSource userFileLocalDataSource = new UserFileLocalDataSource();
    public final Map<String, User> userMap = new HashMap<>();
    public final ArrayList<User> users = new ArrayList<>();
    public static UserRepository instance=null;
    public static UserDataRepository newInstance(){
        if(instance==null){
            instance=new UserDataRepository();
        }
        return (UserDataRepository) instance;
    }


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
