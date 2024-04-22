public class ReverseAll{
    public static String reverse(String s){
        StringBuilder reversed = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i = i - 1){
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
    
    public static String[] reverseAll(String[] strings){
        String[] reversedStrings = new String[strings.length];
        for(int i = 0; i < strings.length; i = i + 1){
            reversedStrings[i] = reverse(strings[i]);
        }
        return reversedStrings;
    }
    
    public static void main(String[] args){
        String[] originalStrings = {"andromeda", "sunflower", "sagittarius"};
        String[] reversedStrings = reverseAll(originalStrings);
        
        for(String originalString : originalStrings){
            System.out.println("Original Word: " + originalString);
        }
        
        for(String reversedString : reversedStrings){
            System.out.println("Reversed Word: " + reversedString);
        }
    }
}