public class NotString{
    public static String notString(String str){
        if(str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }else{
            return "not " + str;
        }
    }
    
    public static void testNotString(String str, String expected){
        String result = notString(str);
        System.out.println(str + expected + result);

        if(result == expected){
            System.out.println("Already NotString!");
        }else{
            System.out.println("Required NotString.");
        }
    }
    
    public static void main(String[] args){
        testNotString("perfume.", "not perfume.");
        testNotString("not cologne.", "not cologne.");
        testNotString("gorgeous.", "not gorgeous.");
    }
}