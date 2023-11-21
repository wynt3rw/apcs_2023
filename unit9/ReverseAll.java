import java.util.*;

public class ReverseAll{
    public static String reverse(String s){
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end){
            char temp = charArray[start];
            charArray[end] = temp;
            
            start = start + 1;
            end = end - 1;
        }
        
        return new String(charArray);
    }
    
    public static String[] reverseAll(String[] strings){
        String[] reversedStrings = new String[strings.length];
        
        for(int i = 0; i < strings.length; i = i + 1){
            reversedStrings[i] = reverse(strings[i]);
        }
        
        return reversedStrings;
    }
    
    public static void main(String[] args){
        String[] originalWord = {"andromeda", "whirlpool", "sagittarius", "sunflower"};
        
        String[] reversedStrings = reverseAll(originalWord);
        
        System.out.println("Original Words: " + java.util.Arrays.toString(originalWord));
        System.out.println("Reversed Words: " + java.util.Arrays.toString(reversedStrings));
    }
}