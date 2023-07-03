package ppt.mock_test1_java;
//  4. Write a Java program to find the largest of three numbers using nested if-else statements.
public class Q4_LargestOf3Numbers {
    static int findLargestOfThreeNumbers(int num1,int num2,int num3){
        if(num1>=num2){
            if(num1>num3)
                return num1;
            else 
                return num3;    
        }
        else if(num2>=num1){
            if(num2>num3)
                return num2;
            else return num3;    
        } 
        return num3;       
    }
    public static void main(String[] args) {
        System.out.println(findLargestOfThreeNumbers(3, 3, 2));
    }
}
