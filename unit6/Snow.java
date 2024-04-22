import processing.core.*;

public class Snow{
    private PApplet papplet;
    private float x;
    private float y;
    private float radius;
    private float speed;
    
    Snow(PApplet p){
        papplet = p;
        x = papplet.random(papplet.width);
        y = papplet.random(papplet.height);
        radius = papplet.random(5, 15);
        speed = papplet.random(1,3);
    }
    
    public void update(){
        y = y + speed;
        
        if(y > papplet.height){
            y = 0;
            x = papplet.random(papplet.width);
        }
    }
    
    public void display(){
        papplet.noStroke();
        papplet.fill(255);
        papplet.ellipse(x, y, radius, radius);
    }
}