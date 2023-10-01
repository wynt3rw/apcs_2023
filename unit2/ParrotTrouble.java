public class ParrotTrouble{
    public static void testParrotTrouble(int hour, boolean talking, boolean correct){
        boolean result = parrotTrouble(hour, talking);
        
        if(result == correct){
            System.out.print("Success!");
        }else{
            System.out.print("Failure.");
        }
    }
    
    public static boolean parrotTrouble(int hour, boolean talking){
        if(talking && (hour < 7 || hour > 20)){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        testParrotTrouble(8, true, true);
        testParrotTrouble(10, false, false);
        testParrotTrouble(19, false, false);
    }
}