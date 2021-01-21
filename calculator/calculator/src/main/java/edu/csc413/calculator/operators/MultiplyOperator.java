package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class MultiplyOperator extends Operator{
    public int priority(){

        return 2;
    }
    public Operand execute(Operand op1, Operand op2){
        Operand temp;
        int value = op1.getValue() * op2.getValue();
        temp = new Operand(value);
        return temp;
    }
}
