package com.example.LLDObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import com.example.LLDObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservable implements StocksObervable
{

    public List<NotificationAlertObserver> iphoneobservers = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
       iphoneobservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        iphoneobservers.remove(observer);
    }

    @Override
    public void notifySubscribers() 
    {
      for(NotificationAlertObserver observer: iphoneobservers)
      {
        observer.update();
      }    
    }
    /* -> When notifying the subscribers call the observer's update method and don't pass the observable object cuz they have to add checks to check whether the object belongs to the same class or not
       which will lead to redundancy of code.

       -> Instead when creating new subscribers/observers object alread pass the observable object into them so that they have to avoid doing the above redundant checks , also with that we can call 
         get data method from Observable object. 
     */

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0)
        {
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount()
    {
      return stockCount;
    }

}