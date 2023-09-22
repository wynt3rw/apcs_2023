public class Fibonacci{
    public static void main(String[] args){
        int x = 0;
        int y = 1;
        
        for(int i = 0; i < 10; i = i + 1){
            System.out.println(x);
            
            int sequence = x + y;
            x = y;
            y = sequence;
        }
    }
}