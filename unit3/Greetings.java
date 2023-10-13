public class Greetings{
    public static String greetings(String name){
        String statement = "Hello, " + name + ", how are you?";
        return statement;
    }
    
    public static void main(String[] args){
        System.out.print(greetings("Valerie"));
        System.out.print(greetings("Dahlia"));
        System.out.print(greetings("Esperanza"));
    }
}