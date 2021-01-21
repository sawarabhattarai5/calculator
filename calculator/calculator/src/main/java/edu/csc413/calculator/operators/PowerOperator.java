package edu.csc413.calculator.operators;
import java.util.*;
import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {

    public int priority(){
        return 3;
    }
    public Operand execute(Operand op1, Operand op2){
        Operand temp;
        double operand1 = op1.getValue();
        double operand2 = op2.getValue();
        double value = Math.pow(operand1, operand2);
        temp = new Operand( (int) value);
        return temp;
    }
}
