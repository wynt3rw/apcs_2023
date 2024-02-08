import java.util.ArrayList;

public class Student{
    private String name;
    private int favoriteNumber;
    
    public Student(String name, int favoriteNumber){
        this.name = name;
        this.favoriteNumber = favoriteNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public int getFavoriteNumber(){
        return favoriteNumber;
    }
}