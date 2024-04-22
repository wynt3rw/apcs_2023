public class DoubleX{
    public static boolean doubleX(String str){
        int i = str.indexOf("x");
        if(i == -1) return false;
        
        String x = str.substring(i);
        return x.startsWith("xx");
    }
    
    public static boolean testDoubleX(String str, boolean expected){
        boolean result = doubleX(str);
        System.out.println(str + " expected: " + expected + " result: " + result);
        
        if(result == expected){
            return true;
            // System.out.println("Correct.");
        }else{
            return false;
            // System.out.println("Incorrect.");
        }
    }
    
    public static void main(String[] args){
        testDoubleX("aaaaa", false);
        testDoubleX("xxttx", true);
        testDoubleX("obbxxq", false);
    }
}