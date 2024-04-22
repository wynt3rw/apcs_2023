public class ScoreKeeperTest{
    public static void main(String[] args){
        ScoreKeeper s = new ScoreKeeper();
        
        s.scoreNormal();
        s.scoreNormal();
        s.scoreBonus();
        
        System.out.println("total: " + s.getTotal());
    }
}