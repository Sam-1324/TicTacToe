package com.example.LLDObserverPattern.Observable;

import com.example.LLDObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObervable 
{
   public void add(NotificationAlertObserver observer);
   public void remove(NotificationAlertObserver observer);
   public void notifySubscribers();
   public void setStockCount(int newStockAdded);
   public int getStockCount();
}