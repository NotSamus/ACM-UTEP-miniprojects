import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

//This works as a game screen
public class GamePanel extends JPanel implements Runnable{
    //screen settings
    final int originalTileSize = 16;//16x16 tile
    final int scale = 3;//scale the screen by 3

    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow; 

    final int fps = 60;
    KeyHandler keyh = new KeyHandler();
    Thread gameThread;

    //set players default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;


    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyh);
        this.setFocusable(true);
    }

    public void start_game_thread(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        while(gameThread != null){
            
            // 1 UPDATE:  update information such as character positions
            update();
            // 2 Draw:  draw the entire screen
            repaint();
        }
    }
    public void update(){
        if(keyh.upPressed==true){
            playerY -= playerSpeed;
        }
        else if(keyh.downPressed==true){
            playerY += playerSpeed;
        }
        else if (keyh.leftPressed==true){
            playerX -= playerSpeed; 
        }
        else if (keyh.rightPressed==true){
            playerX  += playerSpeed;
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(playerX, playerY, tileSize, tileSize);
        g2d.dispose();
    }
}
