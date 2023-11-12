public class SumOfSquares{
    public static double sumOfSquares(double[] numbers){
        double sumOfSquares = 0;
        
        for(double num : numbers){
            sumOfSquares = sumOfSquares + (num * num);
        }
        
        return sumOfSquares;
    }
    
    public static double testSumOfSquares(double[] numbers, double expected){
        double result = sumOfSquares(numbers);
        
        for(double num : numbers){
            System.out.print("Numbers: " + num + ". ");
        }
        
        System.out.println("Expected: " + expected + ". Result: " + result);

        
        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;
    }
    
    public static void main(String[] args){
        double[] numbers1 = {0};
        double[] numbers2 = {1.0, 2.0, 3.0};
        double[] numbers3 = {5.0, 5.0, 5.0};
        
        testSumOfSquares(numbers1, 0);
        testSumOfSquares(numbers2, 14.0);
        testSumOfSquares(numbers3, 75.0);
    }
}