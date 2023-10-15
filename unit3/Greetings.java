public class Greetings{
    public static String greetings(String name){
        String statement = "Hello, " + name + ", how are you?";
        return statement;
    }
    
    public static void testGreetings(String name){
        String result = greetings(name);
        System.out.println(result);
    }
    
    public static void main(String[] args){
        testGreetings("Valerie");
        testGreetings("Dahlia");
        testGreetings("Esperanza");
    }
}