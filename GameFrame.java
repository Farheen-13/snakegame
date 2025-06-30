import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame() {
        this.add(new GamePanel()); // Add the game panel to the frame
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // Automatically sizes the frame to fit the panel
        this.setVisible(true);
        this.setLocationRelativeTo(null); // Center the window
    }
}
