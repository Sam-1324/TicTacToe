package com.example.LLDMomentoDesignPattern;

public class ConfigurationMomento
{
  private int height;
  private int width;
  public ConfigurationMomento(int height , int width)
  {
    this.height = height;
    this.width = width;
  }
  public int getheight()
  {
    return this.height;
  }
  public int getWidth()
  {
    return this.width;
  }

}