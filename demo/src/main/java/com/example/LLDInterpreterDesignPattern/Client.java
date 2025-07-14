package com.example.LLDInterpreterDesignPattern;

public class Client
{
    public static void main (String [] args)
    {
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 8);
        context.put("c", 10);
        context.put("d", 24);

        //We are trying to evaluate the expression --> ((a*b) +(c*d))

        AbstractExpression expression2 = new SumNonTerminalExpression(new MultiplyNonTerminalExpression(new TerminalExpression("a"), new TerminalExpression("b")), new MultiplyNonTerminalExpression(new TerminalExpression("c"), new TerminalExpression("d")));
        System.out.println(expression2.interpret(context));

    }
}