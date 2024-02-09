import processing.core.*;
import processing.core.PApplet;
import java.util.ArrayList;

public class Platformer extends PApplet {

    int playerX, playerY;
    int playerWidth = 20;
    int playerHeight = 20;
    int gravity = 1;
    int jumpSpeed = -15;
    int moveSpeed = 5;
    
    boolean isJumping = false;
    boolean isOnGround = false;
    
    ArrayList<Platform> platforms = new ArrayList<>();

    public void settings() {
        size(600, 400);
    }

    public void setup() {
        frameRate(60);
        playerX = width / 2;
        playerY = height / 2;

        generatePlatforms();
    }

    public void draw() {
        background(255);

        fill(255, 0, 0);
        rect(playerX, playerY, playerWidth, playerHeight);

        for (Platform platform : platforms) {
            platform.display();
        }

        if (!isOnGround) {
            playerY += gravity;
        }

        for (Platform platform : platforms) {
            if (playerX + playerWidth > platform.x && playerX < platform.x + platform.width &&
                    playerY + playerHeight > platform.y && playerY < platform.y + platform.height) {
                playerY = platform.y - playerHeight;
                isOnGround = true;
                break;
            } else {
                isOnGround = false;
            }
        }

        if (playerY > height) {
            gameOver();
        }
    }

    public void keyPressed() {
        if (keyCode == LEFT) {
            playerX -= moveSpeed;
        } else if (keyCode == RIGHT) {
            playerX += moveSpeed;
        } else if (keyCode == ' ' && !isJumping && isOnGround) {
            playerY += jumpSpeed;
            isJumping = true;
        }
    }

    public void keyReleased() {
        if (keyCode == ' ') {
            isJumping = false;
        }
    }

    public void gameOver() {
        playerX = width / 2;
        playerY = height / 2;

        generatePlatforms();
    }

    public void generatePlatforms() {
        platforms.clear();
        for (int i = 0; i < 5; i++) {
            int x = (int) random(width - 200);
            int y = (int) random(height - 100);
            int w = (int) random(50, 200);
            int h = 20;
            platforms.add(new Platform(x, y, w, h));
        }
    }
    
    public static void main(String[] args) {
        PApplet.main("Platformer");
    }
}