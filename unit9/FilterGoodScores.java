import java.util.*;

public class FilterGoodScores{
    public static ArrayList<Integer> filterGoodScores(ArrayList<Integer>scores){
        ArrayList<Integer>over90 = new ArrayList<>();
        
        for(Integer score : scores){
            if(score > 90){
                over90.add(score);
            }
        }
        
        return over90;
    }
    
    public static ArrayList<Integer> testFilterGoodScores(ArrayList<Integer>scores, ArrayList<Integer>expected){
        ArrayList<Integer> result = filterGoodScores(scores);
        System.out.println("Scores: " + scores + ". Expected: " + expected + ". Result: " + result);
        
        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;
    }
    
    public static void main(String[] args){
        ArrayList<Integer>scores = new ArrayList<>();
        scores.add(64);
        scores.add(18);
        scores.add(99);
        scores.add(95);
        scores.add(78);
        
        ArrayList<Integer>expected = new ArrayList<>();
        expected.add(99);
        expected.add(95);
        
        testFilterGoodScores(scores, expected);
    }
}