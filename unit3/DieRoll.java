import java.util.Random;

public class DieRoll{
    public static int dieRoll(){
        Random die = new Random();
        int roll = die.nextInt(7);
        return roll;
    }
    
    public static void testDieRoll(){
        int result = dieRoll();
        System.out.println(result);
    }
    
    public static void main(String[] args){
        for(int i = 0; i < 5; i = i + 1){
            testDieRoll();     
        }
    }
}