public class Attention{
    public static String attention(String str){
        String answerOne = "true";
        String answerTwo = "false";
        
        if(str.length() >= 7 && str.substring(0,8).equals("Hey you!")){
            return answerOne;
        }else{
            return answerTwo;
        }
    }
    
    public static void main(String[] args){
        System.out.print(attention("Hey you! You are missing an assignment!"));
        System.out.print(attention("Hey you! I already said that I wasn't interested."));  
        System.out.print(attention("There is nothing admirable about him."));
    }
}