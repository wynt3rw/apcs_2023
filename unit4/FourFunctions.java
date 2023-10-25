public class FourFunctions{
    public static int SumOfSquares(int n){
        int sum = 0;
        
        for(int i = 1; i < n; i = i + 1){
            int square = i * i;
            sum = sum + square;
        }
        
        return sum;
    }
    
    public static int testSumOfSquares(int n, int expected){
        int result = SumOfSquares(n);
        System.out.println("The expected sum of the squares of " + n + " is " + expected + ". The actual answer is " + result);
        
        if(result == expected){
            System.out.println("Success!");
        }else{
            System.out.println("Failure.");
        }
        
        return result;
    }
    
    
    
    public static int CountOccurences(String whole, String part){
        int count = 0;
        int index = 0;
        
        while((index = whole.indexOf(part, index)) != -1){
            index = index + part.length();
            count = count + 1;
        }
        
        return count;
    }
    
    public static int testCountOccurences(String whole, String part, int expected){
        int result = CountOccurences(whole, part);
        System.out.println("Whole: " + whole + " Part: " + part + " Expected: " + expected + " Result: " + result);
        
        if(result == expected){
            System.out.println("Success!");
        }else{
            System.out.println("Failure.");
        }
        
        return result;
        
    }
    
    
    
    public static String Reverse(String str){
        String rev = "";
        
        for(int i = 0; i < str.length(); i = i + 1){
            rev = str.charAt(i) + rev;
        }
        
        return rev;
    }
    
    public static String testReverse(String str, String expected){
        String result = Reverse(str);
        System.out.println("The expected reverse of " + str + " is " + expected + ". The actual reverse is " + result);
        
        if(result == expected){
            System.out.println("Success!");
        }else{
            System.out.println("Failure.");
        }
    
        return result;
    }
    
    
    
    public static int Factorial(int n){
        int sum = 1;
        
        for(int i = 1; i < n; i = i + 1){
            int factor = i * i - 1;
            sum = factor + sum;
        }
        
        return sum;
    }
    
    public static int testFactorial(int n, int expected){
        int result = Factorial(n);
        System.out.println("The expected sum of the factorials of " + n + " is " + expected + ". The actual sum is " + result);
        
        if(result == expected){
            System.out.println("Success!");
        }else{
            System.out.println("Failure.");
        }
    
        return result;
    }
    
    
    
    public static void main(String[] args){
        testSumOfSquares(4, 30);
        testSumOfSquares(5, 10);
        testSumOfSquares(6, 55);

        testCountOccurences("banananananana", "nana", 4);
        testCountOccurences("dododododo", "do", 5);
        testCountOccurences("random", "dom", 2);
        
        testReverse("Australia", "Australia");
        testReverse("Ukraine", "Ukraine");
        testReverse("Mexico", "Mexico");
        
        testFactorial(16, 1226);
        testFactorial(17, 1481);
        testFactorial(18, 2021);
    }
}