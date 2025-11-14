//Contains main... run me to launch the game!
import java.awt.*;

public class Launcher{
    
    //Initializes and launches the game
    public static void main(String[] args){              
        // GameEngine game = new ScrollingGame();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        GameEngine clashGame = new LiGame(width, height);
        clashGame.playGame();    
    }        
    
}
