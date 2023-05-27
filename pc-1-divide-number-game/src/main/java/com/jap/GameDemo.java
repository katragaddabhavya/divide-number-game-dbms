package com.jap;

public class GameDemo {
    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int finalNumber = 0;
        try {
            //write logic
            finalNumber=(firstNumber / secondNumber);
            //Handle specific exception
        }catch (Exception exception){
            return exception.toString();
        }
        return String.valueOf(finalNumber);
    }
    public static void main(String[] args){
        GameDemo divison=new GameDemo();
        String rem=divison.divideByNumber(10,5);
        System.out.println(rem);
        String Remainder=divison.divideByNumber(10,0);
        System.out.println(Remainder);
    }

}