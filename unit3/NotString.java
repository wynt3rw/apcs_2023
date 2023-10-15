public class NotString{
    public static String notString(String str){
        if(str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }else{
            return "not " + str;
        }
    }
    
    public static void testNotString(String str){
        String result = notString(str);
        System.out.println(str + result);
    }
    
    public static void main(String[] args){
        testNotString("perfume");
        testNotString("not cologne");
        testNotString("gorgeous");
    }
}