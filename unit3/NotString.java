public class NotString{
    public static String notString(String str){
        if(str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }else{
            return "not " + str;
        }
    }
    
    public static void main(String[] args){
        System.out.print(notString("perfume"));
        System.out.print(notString("not cologne"));
        System.out.print(notString("gorgeous"));
    }
}