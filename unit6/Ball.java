import processing.core.*;

public class Ball{
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c;
    
    public Ball(PApplet p, PVector position, PVector velocity, float radius, int c){
        this.p = p;
        this.position = position.copy();
        this.velocity = velocity.copy();
        this.radius = radius;
        this.c = c;
    }
    
    public void display(){
        p.fill(c);
        p.noStroke();
        p.ellipse(position.x, position.y, radius*2, radius*2);
        
        position.add(velocity);
        
        if(position.x < radius || position.x > p.width-radius){
            velocity.x = velocity.x * -1;
        }
        
        if(position.y < radius || position.y > p.height-radius){
            velocity.y = velocity.y * -1;
        }
    }
}