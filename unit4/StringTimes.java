public class StringTimes{
    public static String stringTimes(String str, int n){
        String answer = "";
        
        for(int i = 0; i < n; i = i + 1){
            answer = answer + str;
        }
        
        return answer;
    }
    
    public static String testStringTimes(String str, int n, String expected){
        String result = stringTimes(str, n);
        System.out.println(str + ", " + n + " expected: " + expected + " result: " + result);
        
        if(result == expected){
            System.out.println("Correct.");
        }else{
            System.out.println("Incorrect.");
        }
        
        return result;  
    }
    
    public static void main(String[] args){
        testStringTimes("hi", 2, "hihihi");
        testStringTimes("no", 3, "nononono");
        testStringTimes("x", 4, "xxxxxx");
    }
}