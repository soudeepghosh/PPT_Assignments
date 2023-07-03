package ppt.mock_test1_java;
// 3. Write a Java program to calculate the average of a list of numbers using a do-while loop.

import java.util.Scanner;

public class Q3_AverageOfListOfANumber {
    static int findAvg(int[] arr){
        int i = 0, sum = 0;
        do{
            sum += arr[i];
            i++;
        }while(i<arr.length);
        return sum/arr.length;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        System.out.println("Enter the elements to find average: ");
        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }
        System.out.println("The average of that elements: "+findAvg(list));
        sc.close();
    }
}
