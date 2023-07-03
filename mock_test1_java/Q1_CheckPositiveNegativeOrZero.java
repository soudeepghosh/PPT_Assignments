package ppt.mock_test1_java;
// 1. Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
public class Q1_CheckPositiveNegativeOrZero {
    static void isPosOrNegOrZero(int num){
        if(num<0)
            System.out.println(num+" is a negative number.");
        else if(num>0)    
            System.out.println(num+" is a positive number.");
        else
            System.out.println("The number you have entered ("+num+") is zero.");    
    }
    public static void main(String[] args) {
        isPosOrNegOrZero(0);
        isPosOrNegOrZero(20);
        isPosOrNegOrZero(Integer.MIN_VALUE);
    }
}
