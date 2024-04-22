import java.util.*;

public class CountLucky{
    public static int countLucky(ArrayList<Integer>numbers){
        int count = 0;
        
        for(int num : numbers){
            if(num % 7 == 0 || num % 10 == 7){
                count = count + 1;
            }
        }
        return count;
    }
    
    public static int testCountLucky(ArrayList<Integer>numbers, int expected){
        int result = countLucky(numbers);
        
        for(int num : numbers){
            System.out.println("Numbers: " + num);
            System.out.println("Expected: " + expected + ". Result: " + result);
        }
        
        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        } 
        return result;  
    }
    
    
    
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(27);
        numbers.add(70);
        numbers.add(36);

        testCountLucky(numbers, 3);
    }
}
