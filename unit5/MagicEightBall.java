import java.util.Random;

public class MagicEightBall{
    public String question; 
    private final String[] answer = {"Yes.", "No.", "Maybe.", "Undefined."};
    private Random random = new Random();
    
    public MagicEightBall(){
        
    }
    
    public String ask(String questionIn){
        question = questionIn;

        int index = random.nextInt(answer.length);
        return answer[index];
    }

    public void answer(){
        System.out.println("The question is: " + question + " The answer is: " + answer);        
    }
    
    public String getQuestion(String questionIn){
        return question;
    }
}