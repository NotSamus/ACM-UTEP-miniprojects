/**
 * main
 */
import javax.swing.JFrame;
public class Run {

    public static void main(String[] args) {
        JFrame window = new JFrame("2D Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(800, 600);
        // window.add(new Game());
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePanel.start_game_thread();
    }
}