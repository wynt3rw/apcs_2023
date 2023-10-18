public class Attention{
    public static String attention(String str){    
        String answerOne = "True.";
        String answerTwo = "False.";
        
        if(str.length() >= 7 && str.substring(0,8).equals("Hey you!")){
            return answerOne;
        }else{
            return answerTwo;
        }
    }
    
    public static void testAttention(String str, String expected){
        String result = attention(str);
        System.out.println(str + expected + result);
        
        if(result == expected){
            System.out.println("Success!");
        }else{
            System.out.println("Failure.");
        }
    }
    
    public static void main(String[] args){
        testAttention("Hey you! You are missing an assignment!", "True.");
        testAttention("Hey you! I already said that I wasn't interested.", "False.");  
        testAttention("There is nothing admirable about him.", "False.");
    }
}