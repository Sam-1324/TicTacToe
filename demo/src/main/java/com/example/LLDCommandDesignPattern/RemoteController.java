package com.example.LLDCommandDesignPattern;


public class RemoteController
{
    ICommand command;
    public RemoteController()
    {

    }
    public void setCommand(ICommand command)
    {
        this.command = command; //Setting the command value
    }
    public void pressButton()
    {
        command.execute();
    }
}