import java.util.*;

public class CountZNames{
    public static int countZNames(ArrayList<String>strings){
        int count = 0;
        
        for(String str : strings){
            if(str.startsWith("z") || str.startsWith("Z")){
                count = count + str.length();
            }
        }
        
        return count;
    }
    
    public static int testCountZNames(ArrayList<String>strings, int expected){
        int result = countZNames(strings);
        
        for(String str : strings){
            System.out.print("Names: " + str + ". ");
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
        ArrayList<String>strings = new ArrayList<>();
        strings.add("Zephyr");
        strings.add("Dr. Kessner");
        strings.add("Zorro");
        
        testCountZNames(strings, 11);
    }
}