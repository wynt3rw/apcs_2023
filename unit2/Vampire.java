public class Vampire{
    public static void testVampire(int hour, boolean awake, boolean correct){
        boolean result = vampire(hour, awake);
        
        if(result == correct){
            System.out.print("Sucess!");
        }else{
            System.out.print("Failure.");
        }
    }
    
    public static boolean vampire(int hour, boolean awake){
        if(awake && (hour < 6 || hour > 22)){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        testVampire(5, true, true);
        testVampire(7, false, false);
        testVampire(23, false, false);
    }
}