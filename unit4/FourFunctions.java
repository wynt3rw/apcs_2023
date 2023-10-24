public class FourFunctions{
    public static int SumOfSquares(int n){
        int sum = 0;
        
        for(int i = 1; i < n; i = i + 1){
            int square = i * i;
            sum = sum + square;
        }
        
        return sum;
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
    
    public static String Reverse(String str){
        String rev = "";
        
        for(int i = 0; i < str.length(); i = i + 1){
            rev = str.charAt(i) + rev;
        }
        
        return rev;
    }
    
    public static int Factorial(int n){
        int sum = 1;
        
        for(int i = 1; i < n; i = i + 1){
            int factor = i * i - 1;
            sum = factor + sum;
        }
        
        return sum;
    }
    
    public static void main(String[] args){
        System.out.println("The sum of the squares of four is " + SumOfSquares(4));
        System.out.println("The sum of the squares of five is " + SumOfSquares(5));
        System.out.println("The sum of the squares of six is " + SumOfSquares(6));

        System.out.println(CountOccurences("banananananana", "nana"));
        System.out.println(CountOccurences("dododododo", "do"));
        System.out.println(CountOccurences("random", "dom"));
        
        System.out.println(Reverse("Australia"));
        System.out.println(Reverse("Ukraine"));
        System.out.println(Reverse("Mexico"));
        
        System.out.println("The sum of the factorials of sixteen is " + Factorial(16));
        System.out.println("The sum of the factorials of seventeen is " + Factorial(17));
        System.out.println("The sum of the factorials of eighteen is " + Factorial(18));
    }
}