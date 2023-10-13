public class MissingChar{
    public static String missingChar(String str, int n){
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        
        return front + back;
    }
    
    public static void main(String[] args){
        System.out.print(missingChar("surfboard", 2));
        System.out.print(missingChar("marine", 3));
        System.out.print(missingChar("headphones", 5));
    }
}