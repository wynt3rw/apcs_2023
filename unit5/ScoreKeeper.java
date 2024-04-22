public class ScoreKeeper{
    private int total = 0;
    
    public ScoreKeeper(){
        total = 0;
    }
    
    public void scoreNormal(){
        total = total + 100;
    }
    
    public void scoreBonus(){
        total = total + 1000;
    }
    
    public int getTotal(){
        return total;
    }
}