public class Greetings{
    public static String greetings(String name){
        String statement = "Hello, " + name + ", how are you?";
        return statement;
    }
    
    public static void testGreetings(String name, String expected){
        String result = greetings(name);
        System.out.println(name + expected + result);
        
        if(result == expected){
            System.out.println("Success!");
        }else{
            System.out.println("Failure.");
        }
    }
    
    public static void main(String[] args){
        testGreetings("Valerie", "Hello, how are you?");
        testGreetings("Dahlia", "How are you?");
        testGreetings("Esperanza", "Hello, Esperanza, how are you?");
    }
}