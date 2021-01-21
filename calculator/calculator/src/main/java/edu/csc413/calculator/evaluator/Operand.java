package edu.csc413.calculator.evaluator;

import static java.lang.Integer.*;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    /**
     * construct operand from string token.
     */
    private String token;

    public Operand(String token) {
        // we can get string as null
        this.token = token;
        }


    /**
     * construct operand from integer
     */
    public String getToken()
    {

        return this.token;

    }

    public Operand (int value){
        this.token = Integer.toString(value);
    }

    /**
     * return value of operand
     */
    public int getValue() {

        try{
            int value = Integer.parseInt(this.token);
            return value;
        }
        catch (NumberFormatException e){
            return 0;
        }
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try {
            double value = Double.parseDouble(token);
            return true;
            //Integer.parseInt(token);

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
