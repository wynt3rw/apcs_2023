import java.util.*;

public class Fibonacci{
    public static int[] fibonacci(int n){
        int[] fibonacciSequence = new int[n];
        
        if(n >= 1){
            fibonacciSequence[0] = 0;
        }
        
        if(n >= 2){
            fibonacciSequence[1] = 1;
        }
        
        for(int i = 2; i < n; i = i + 1){
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        
        return fibonacciSequence;
    }
    
    public static void main(String[] args){
        int n = 10;
        int[] fibonacciSequence = fibonacci(n);
        
        System.out.println("The first " + n + " numbers of the Fibonacci Sequence are:" + fibonacciSequence);
    }
}