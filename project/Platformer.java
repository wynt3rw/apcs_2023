import processing.core.*;
import processing.core.PApplet;

public class Platformer extends PApplet {

    int playerX, playerY;
    int playerWidth = 40, playerHeight = 40;
    int groundY;
    boolean isJumping = false;
    int jumpStrength = 12;
    int gravity = 1;
    
    int enemy1X, enemy1Y, enemy2X, enemy2Y, enemy3X, enemy3Y;
    int enemySize = 30;
    int enemySpeed = 2;

    boolean gameOver = false;
    
    public void settings() {
        size(800, 800);
    }
    
    public void setup() {
        playerX = width / 2;
        playerY = height - playerHeight;
        groundY = height - 50;
        
        enemy1X = width;
        enemy1Y = groundY - enemySize;
        enemy2X = width + 300;
        enemy2Y = groundY - enemySize;
        enemy3X = width + 600;
        enemy3Y = groundY - enemySize;
    }
    
    public void draw() {
        background(255);
        
        // Draw ground
        fill(100);
        rect(0, groundY, width, height - groundY);
        
        // Draw player
        fill(0, 0, 255);
        rect(playerX, playerY, playerWidth, playerHeight);
        
        // Draw enemies
        fill(255, 0, 0);
        rect(enemy1X, enemy1Y, enemySize, enemySize);
        rect(enemy2X, enemy2Y, enemySize, enemySize);
        rect(enemy3X, enemy3Y, enemySize, enemySize);
        
        if (!gameOver) {
            // Update player position
            if (keyPressed) {
                if (keyCode == LEFT) {
                    playerX -= 5;
                } else if (keyCode == RIGHT) {
                    playerX += 5;
                } 
                
                if (keyCode == 'C' && !isJumping) {
                    isJumping = true;
                }
            }
            
            // Apply gravity
            if (playerY < groundY - playerHeight) {
                playerY += gravity;
            } else {
                playerY = groundY - playerHeight;
                isJumping = false;
            }
            
            // Update enemy position
            enemy1X -= enemySpeed;
            enemy2X -= enemySpeed;
            enemy3X -= enemySpeed;
            
            // Check for collisions
            if (collision(playerX, playerY, playerWidth, playerHeight, enemy1X, enemy1Y, enemySize, enemySize) ||
                collision(playerX, playerY, playerWidth, playerHeight, enemy2X, enemy2Y, enemySize, enemySize) ||
                collision(playerX, playerY, playerWidth, playerHeight, enemy3X, enemy3Y, enemySize, enemySize)) {
                gameOver = true;
            }
            
            // Check if player has reached the end
            if (playerX + playerWidth >= width) {
                textSize(32);
                fill(0, 255, 0);
                text("You Win!", width/2 - 100, height/2);
                noLoop();
            }
        } else {
            // Display restart button
            textSize(32);
            fill(255, 0, 0);
            text("Game Over!", width/2 - 100, height/2);
            fill(0);
            rect(width/2 - 50, height/2 + 50, 100, 50);
            fill(255);
            text("Restart", width/2 - 40, height/2 + 85);
        }
    }
    
    boolean collision(int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2) {
        return x1 < x2 + w2 &&
               x1 + w1 > x2 &&
               y1 < y2 + h2 &&
               y1 + h1 > y2;
    }
    
    public void mousePressed() {
        if (gameOver && mouseX > width/2 - 50 && mouseX < width/2 + 50 && mouseY > height/2 + 50 && mouseY < height/2 + 100) {
            restart();
        }
    }
    
    void restart() {
        playerX = width / 2;
        playerY = height - playerHeight;
        
        enemy1X = width;
        enemy1Y = groundY - enemySize;
        enemy2X = width + 300;
        enemy2Y = groundY - enemySize;
        enemy3X = width + 600;
        enemy3Y = groundY - enemySize;
        
        gameOver = false;
        loop();
    }
    
    public static void main(String[] args) {
        PApplet.main("Platformer");
    }
}