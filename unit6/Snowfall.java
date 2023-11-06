import processing.core.*;
import java.util.*;

public class Snowfall extends PApplet{
    private ArrayList<Snow>snowflakes;
    
    public void settings(){
        size(400,400);
    }
    
    public void setup(){
        snowflakes = new ArrayList<Snow>();
        
        for(int i = 0; i < 80; i = i + 1){
            addSnow();
        }
    }
    
    public void addSnow(){
        PVector position = new PVector(width/2, height/2);
        PVector velocity = PVector.random2D();
        velocity.setMag(random(1,5));
        float radius = random(5, 15);
        int c = color(255, 255, 255);
        
        Snow s = new Snow(this, position, velocity, radius, c);
        snowflakes.add(s);
    }
    
    public void draw(){
        background(0);
        
        for(Snow s : snowflakes){
            s.display();
        }
    }
    
    public static void main(String[] args){
        PApplet.main("Snow");
    }
}