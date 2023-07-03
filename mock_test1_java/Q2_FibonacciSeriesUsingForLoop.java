package ppt.mock_test1_java;
//2. Write a Java program to print the Fibonacci series up to a given number using a for loop.
public class Q2_FibonacciSeriesUsingForLoop {
    public static void fibonacciSeries(int n) {
        if(n==0 || n==1) System.out.print(n+" ");
        else{
            int nm1 = 1;
            int nm2 = 0;
            int num = nm1+nm2;
            System.out.print(nm2+" "+nm1+" "+num+" ");
            
            for(int i=3;i<=n;i++){
                nm2 = nm1;
                nm1 = num;
                num = nm1 + nm2;
             System.out.print(num+" ");
            }
        }
    }
    public static void main(String[] args) {
        fibonacciSeries(1);
    }
}
