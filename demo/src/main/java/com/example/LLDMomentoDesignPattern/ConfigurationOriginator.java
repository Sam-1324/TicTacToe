package com.example.LLDMomentoDesignPattern;

public class ConfigurationOriginator
{
    private int height;
    private int width;

    public ConfigurationOriginator(int height , int width)
    {
      this.height = height;
      this.width = width;
    }
    public void setHeight(int height)
    {
      this.height = height;
    }
    public void setWidth(int width)
    {
      this.width = width;
    }
    public ConfigurationMomento createMomento()
    {
        return new ConfigurationMomento(this.height,this.width);
    }

    //With the help of this method we can be able to restore the previous state of the object
    public void restoreMomento(ConfigurationMomento restorMomento)
    {
      this.height = restorMomento.getheight();
      this.width = restorMomento.getWidth();
    }
    public int getHeight()
    {
       return this.height;
    }
    public int getWidth()
    {
        return this.width;
    }
}