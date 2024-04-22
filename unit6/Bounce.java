import processing.core.*;
import java.util.*;

public class Bounce extends PApplet{
    private ArrayList<Ball>balls;
    
    public void settings(){
        size(800,800);
    }
    
    public void setup(){
        balls = new ArrayList<Ball>();
        
        for(int i = 0; i < 10; i = i + 1){
            addBall();
        }
    }
    
    public void addBall(){
        PVector position = new PVector(width/2, height/2);
        PVector velocity = PVector.random2D();
        velocity.setMag(random(5,10));
        float radius = random(10, 20);
        int c = color(random(256), random(256), random(256));
        
        Ball b = new Ball(this, position, velocity, radius, c);
        balls.add(b);
    }
    
    public void draw(){
        background(0);
    
        for(Ball b : balls){
            b.display();
        }
    }
    
    public void keyPressed(){
        for(int i = 0; i < 10; i = i + 1){
            addBall();
        }
    }
    
    public static void main(String[] args){
        PApplet.main("Bounce");
    }
}