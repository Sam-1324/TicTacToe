package com.example.LLDObserverPattern.Observer;

import com.example.LLDObserverPattern.Observable.StocksObervable;

public class EmailAlertobserver implements NotificationAlertObserver
{
  private String email;
  private StocksObervable iphoneObervable;
  public EmailAlertobserver(String Email, StocksObervable iphoneObervable)
  {
    this.email = Email;
    this.iphoneObervable = iphoneObervable;
  }
  @Override
   public void update()
   {
     sendMail(email, "product is in stock hurry up !" );
   }
   private void sendMail(String email , String msg)
   {
     System.out.println(msg + email);
   }

}