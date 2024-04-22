import java.util.Random;

public class CoinFlip{
    public static String coinFlip(){
        Random flip = new Random();
        int result = flip.nextInt(2);
        
        if(result == 0){
            return "heads";
        }else{
            return "tails";
        }
        
    }
    
    public static void testCoinFlip(){
        System.out.println("flip: " + coinFlip());
        }
    
    public static void main(String[] args){
        for(int i = 0; i < 20; i = i + 1){
            testCoinFlip();
        }
    }
}