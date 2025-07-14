package com.example.LLDPaymentGateway.User;

public class User
{
   int id;
   String userName;
   String email;

   public int getId()
   {
     return this.id;
   }
   public String getEmail()
   {
     return this.email;
   }
   public String getUserName()
   {
     return this.userName;
   }
   public void setId(int id)
   {
     this.id  = id;
   }
   public void setEmail(String email)
   {
     this.email = email;
   }
   public void setUserName(String userName)
   {
     this.userName = userName;
   }

}
