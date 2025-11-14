/**
 * Warden is the player-controlled entity, representing the Grand Warden
 * from Clash of Clans. It has the same functionality as the base Player
 * but with custom dimensions and sprite.
 */
public class Warden extends Player {
    public static final String WARDEN_IMAGE_FILE = "game_assets/grandWarden.gif";
    //Dimensions of the Player
    public static final int WARDEN_WIDTH = LiGame.getWidth()/9; //75;
    public static final int WARDEN_HEIGHT = LiGame.getWidth()/9; //75;

    public Warden(){
        this(0, 0);        
     }
     public Warden(int x, int y){
        this(x, y, WARDEN_WIDTH, WARDEN_HEIGHT, WARDEN_IMAGE_FILE);  
     }

     public Warden(int x, int y, int width, int height, String filename){
        super(x, y, width, height, filename);  
     }
     

}
