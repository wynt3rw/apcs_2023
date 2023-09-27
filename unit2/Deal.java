public class Deal{
    public static void testDeal(double originalPrice, double salePrice, boolean correct){
        boolean result = goodDeal(originalPrice, salePrice);
        
        if(result == correct){
            System.out.println("Success!");
        }else{
            System.out.println("Failure.");
        }
    }
    
    public static boolean goodDeal(double originalPrice, double salePrice){
        if(salePrice < 0.75 * originalPrice){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        testDeal(100.0, 21.0, true);
        testDeal(250.0, 200.0, true);
        testDeal(430.0, 100.0, false);
    }
}