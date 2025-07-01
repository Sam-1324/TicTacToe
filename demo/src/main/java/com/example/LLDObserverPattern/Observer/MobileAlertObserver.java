package com.example.LLDObserverPattern.Observer;

import com.example.LLDObserverPattern.Observable.StocksObervable;

public class MobileAlertObserver implements NotificationAlertObserver
{
  private String phoneNumber;
  private StocksObervable iphoneObservable;
  public MobileAlertObserver(String phoneNumber , StocksObervable iphoneObservable)
  {
    this.phoneNumber = phoneNumber;
    this.iphoneObservable = iphoneObservable;
  }
   @Override
   public void update()
   {
     sendAlert(phoneNumber, "product is in stock hurry up:" );
   }
   private void sendAlert(String phone, String msg)
   {
     System.out.println(msg + phone);
   }

}