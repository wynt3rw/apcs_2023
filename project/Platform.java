import processing.core.*;
import processing.core.PApplet;
import java.util.ArrayList;

public class Platform {
    int x, y, width, height;

     public Platform(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

     public void display() {
        fill(0, 0, 255);
        rect(x, y, width, height);
    }
}