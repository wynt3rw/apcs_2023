import java.util.*;

public class SumOfSquares{
    public static double sumOfSquares(ArrayList<Double>numbers){
        double count = 0;
        
        for(double num : numbers){
            count = count + (num * num);
        }
        
        return count;
    }
    
    public static double testSumOfSquares(ArrayList<Double>numbers, double expected){
        double result = sumOfSquares(numbers);
        
        for(double num : numbers){
            System.out.print("Numbers: " + num + ". ");
            System.out.println("Expected: " + expected + ". Result: " + result);
        }

        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;     
    }
    
    public static void main(String[] args){
        ArrayList<Double>numbers = new ArrayList<>();
        numbers.add(2.0);
        numbers.add(2.0);
        numbers.add(2.0);
        
        testSumOfSquares(numbers, 12.0);
    }
}