package com.example.LLDInterpreterDesignPattern;


public class TerminalExpression implements AbstractExpression
{
    public String name;
    public TerminalExpression(String name)
    {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.get(name);
    }
  
}