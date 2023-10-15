public class MissingChar{
    public static String missingChar(String str, int n){
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        
        return front + back;
    }
    
    public static void testMissingChar(String str, int n){
        String result = missingChar(str, n);
        System.out.print(str + n + result);
    }
    
    public static void main(String[] args){
        testMissingChar("surfboard", 2);
        testMissingChar("marine", 3);
        testMissingChar("headphones", 5);
    }
}