package com.example.LLDPaymentGateway.User;


public class UserDO
{
   int id;
   String firstName;
   String mail;

   public String getMail()
   {
     return this.mail;
   }
   public String getName()
   {
     return this.firstName;
   }
   public void setId(int id)
   {
     this.id  = id;
   }
   public void setEmail(String email)
   {
     this.mail = email;
   }
   public void setName(String userName)
   {
     this.firstName = userName;
   }
}