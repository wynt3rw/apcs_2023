public class Attention{
    public static String attention(String str){
        String answerOne = "True";
        String answerTwo = "False";
        
        if(str.length() >= 7 && str.substring(0,8).equals("Hey you!")){
            return answerOne;
        }else{
            return answerTwo;
        }
    }
    
    public static void testAttention(String str){
        String result = attention(str);
        System.out.println(str + result);
    }
    
    public static void main(String[] args){
        testAttention("Hey you! You are missing an assignment!");
        testAttention("Hey you! I already said that I wasn't interested.");  
        testAttention("There is nothing admirable about him.");
    }
}