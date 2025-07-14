package com.example.LLDInterpreterDesignPattern;

public class SumNonTerminalExpression implements AbstractExpression
{
     AbstractExpression leftMultiplyExpression;
     AbstractExpression rightMultiplyExpression;
     public SumNonTerminalExpression(AbstractExpression leftMultiplyExpression , AbstractExpression rightMultiplyExpression)
     {
       this.leftMultiplyExpression = leftMultiplyExpression;
       this.rightMultiplyExpression = rightMultiplyExpression;
     }
     public int interpret(Context context)
     {
       return leftMultiplyExpression.interpret(context) + rightMultiplyExpression.interpret(context);
     }
     
}