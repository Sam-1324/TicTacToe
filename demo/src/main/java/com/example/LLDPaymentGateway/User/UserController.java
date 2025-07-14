package com.example.LLDPaymentGateway.User;

public class UserController
{
  UserService userService;
  public UserController()
  {
    userService = new UserService();
  }
  public UserDO addUser(UserDO userDDOObj)
  {
    return userService.addUser(userDDOObj);
  }
  public UserDO getUser(int userID)
  {
    return userService.getUser(userID);
  }
  
}