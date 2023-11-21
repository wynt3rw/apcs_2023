public class FindMax{
    public static double findMax(double[] values){
        double max = values[0];
        
        for(int i = 1; i < values.length; i = i + 1){
            if(values[i] > max){
                max = values[i];            
            }
        }
        
        return max;
    }
    
    public static double testFindMax(double[] values, double expected){
        double result = findMax(values);
        System.out.println("Values: " + values + ". Expected: " + expected + ". Result: " + result);
        
        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;
    }
    
    public static void main(String[] args){
        double[] values = {6.96, 3.14, 2.54, 4.44, 5.28};
        
        testFindMax(values, 6.96);
    }
}