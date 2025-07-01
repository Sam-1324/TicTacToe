package com.example.LLDObserverPattern;

import com.example.LLDObserverPattern.Observable.IphoneObservable;
import com.example.LLDObserverPattern.Observable.StocksObervable;
import com.example.LLDObserverPattern.Observer.EmailAlertobserver;
import com.example.LLDObserverPattern.Observer.MobileAlertObserver;
import com.example.LLDObserverPattern.Observer.NotificationAlertObserver;

public class Main
{
    public static void main(String[] args)
    {
      StocksObervable iphoneObervable = new IphoneObservable();
      NotificationAlertObserver observer1 = new EmailAlertobserver("senguptsamiran621@gmail.com",iphoneObervable);
      NotificationAlertObserver observer2 = new EmailAlertobserver("samiran.sengupta@fortum.com",iphoneObervable);
      NotificationAlertObserver observer3 = new MobileAlertObserver("96500013602",iphoneObervable);

     //Adding the observers into the Iphone Observale list

      iphoneObervable.add(observer1);
      iphoneObervable.add(observer2);
      iphoneObervable.add(observer3);

      iphoneObervable.setStockCount(100);
    }  
}

