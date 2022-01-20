package storage;


import model.User;
import util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {


    private Map<String, User> users = new HashMap<>();

    public void addUser(String email, User user) {
        users.put(email, user);
        FileUtil.serializeUser(users);
    }


    public User getByEmail(String email) {
        return users.get(email);
    }


    public void initData() {
        //stex payman einq stuge, or ete null e mi veragre ed e xndiry? aha myam naye porcem pordze

        Map<String, User> userMap = FileUtil.deserializeUser();
        if(userMap != null){
            this.users = userMap;
        }
    }
}
