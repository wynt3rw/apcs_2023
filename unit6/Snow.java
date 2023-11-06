import processing.core.*;

public class Snow{
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c;
    
    public Snow(PApplet p, PVector position, PVector velocity, float radius, int c){
        this.p = p;
        this.position = position.copy();
        this.velocity = velocity.copy();
        this.radius = radius;
        this.c = c;
    }
    
    public void display(){
        p.fill(c);
        p.noStroke();
        p.ellipse(position.x, position.y, radius, radius);
        
        position.add(velocity);
        
        if(position.y > p.height){
            position.y = 0;
        }
    }
}