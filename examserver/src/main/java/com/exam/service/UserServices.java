package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface  UserServices {
    //creating user
    public User createUser(User user, Set<UserRole>userRoles) throws Exception;
    // get user by username
    public  User getUser(String username);

    //delete user by user id
    public  void deleteUser(Long userid);
}


//package com.exam.service;
//
//public interface UserServices {
//}
