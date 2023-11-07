import processing.core.*;
import java.util.*;

public class Snowfall extends PApplet{
    int snowflake = 80;
    Snow[] snowflakes = new Snow[snowflake];
    
    public void settings(){
        size(400,400);
    }
    
    public void setup(){
        for(int i = 0; i < snowflake; i = i + 1){
            snowflakes[i] = new Snow(this);
        }
    }
    
    public void draw(){
        background(0);
        
        for(Snow snowflake : snowflakes){
            snowflake.update();
            snowflake.display();
        }
    }
    
    public static void main(String[] args){
        PApplet.main("Snowfall");
    }
}