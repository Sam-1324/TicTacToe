package com.example.LLDPaymentGateway.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService
{
     static List<User> userList = new ArrayList<>();
     public UserDO addUser(UserDO userDO)
     {
       User user = new User();
       user.setUserName(userDO.getName());
       user.setEmail(userDO.getMail());
       user.setId((int) new Random().nextInt(100-10)+10);
       userList.add(user);
       
       return convertUserDOToUser(user);
     }

     public UserDO getUser(int id)
     {
        for(User user: userList)
        {
            if(user.getId() == id)
            {
                return convertUserDOToUser(user);
            }
        }
        return null;
     }
    
     private UserDO convertUserDOToUser(User user)
     {
        UserDO userDO = new UserDO();
        userDO.setName(user.getUserName());
        userDO.setEmail(user.getEmail());
        userDO.setId(user.getId());
        
        return userDO;
     }
}