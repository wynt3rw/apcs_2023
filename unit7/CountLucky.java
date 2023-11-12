public class CountLucky{
    public static int countLucky(int[] numbers){
        int luck = 0;
        
        for(int num : numbers){
            if(num % 7 == 0 || num % 10 == 7){
                luck = luck + 1;
            }
        }
        
        return luck;
    }
    
    public static int testCountLucky(int[] numbers, int expected){
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
    
    public static void main(String[] args){
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {7, 13, 17};
        int[] numbers3 = {107, 207, 307};
            
        testCountLucky(numbers1, 0);
        testCountLucky(numbers2, 2);
        testCountLucky(numbers3, 3);
    }
}