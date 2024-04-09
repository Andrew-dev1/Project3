import java.awt.*;
import java.awt.event.*;
import java.util.*;

//A Simple version of the scrolling game, featuring Avoids, Gets, and RareGets
//Players must reach a score threshold to win
//If player runs out of HP (via too many Avoid collisions) they lose
public class ScrollingGame extends GameEngine {
    
    
    //Starting Player coordinates
    protected static final int STARTING_PLAYER_X = 0;
    protected static final int STARTING_PLAYER_Y = 100;
    
    //Score needed to win the game
    protected static final int SCORE_TO_WIN = 300;
    
    //Maximum that the game speed can be increased to
    //(a percentage, ex: a value of 300 = 300% speed, or 3x regular speed)
    protected static final int MAX_GAME_SPEED = 300;
    //Interval that the speed changes when pressing speed up/down keys
    protected static final int SPEED_CHANGE_INTERVAL = 20;    
    
    public static final String INTRO_SPLASH_FILE = "game_assets/splash.gif";        
    //Key pressed to advance past the splash screen
    public static final int ADVANCE_SPLASH_KEY = KeyEvent.VK_ENTER;
    
    //Interval that Entities get spawned in the game window
    //ie: once every how many ticks does the game attempt to spawn new Entities
    protected static final int SPAWN_INTERVAL = 45;

    
    //A Random object for all your random number generation needs!
    public static final Random rand = new Random();
    
    //Player's current score
    protected int score;
    
    
    //Stores a reference to game's Player object for quick reference
    //(This Player will also be in the displayList)
    protected Player player;
    
    
    public ScrollingGame(){
        super();
    }
    
    public ScrollingGame(int gameWidth, int gameHeight){
        super(gameWidth, gameHeight);
    }
    
    
    //Performs all of the initialization operations that need to be done before the game starts
    protected void pregame(){
        this.setBackgroundColor(Color.BLACK);
        player = new Player(STARTING_PLAYER_X, STARTING_PLAYER_Y);
        displayList.add(player); 
        score = 0;
        System.out.println("hello");

        super.setSplashImage(INTRO_SPLASH_FILE);
    }
    
    //Called on each game tick
    protected void updateGame(){
        //scroll all scrollable Entities on the game board
        scrollEntities();   
        //Spawn new entities only at a certain interval
        if (super.getTicksElapsed() % SPAWN_INTERVAL == 0){
            spawnEntities();
        }
        //Update the title text on the top of the window
        setTitleText("Something is here"); 
    }
    
    
    //Scroll all scrollable entities per their respective scroll speeds
    private void scrollEntities(){

        //****   implement me!   ****

    }
    
    
    
    //Called whenever it has been determined that the Player collided with a consumable
    private void handlePlayerCollision(Consumable collidedWith){

        //****   implement me!   ****

    }
    
    
    //Spawn new Entities on the right edge of the game board
    private void spawnEntities(){

        //****   implement me!   ****
        
   }
    
    //Called once the game is over, performs any end-of-game operations
    protected void postgame(){

        super.setTitleText("Game is over! You need to do something here!");
    }
    
    //Determines if the game is over or not
    //Game can be over due to either a win or lose state
    protected boolean isGameOver(){
        if(player.getHP() == 0)
            return true;   //****   placeholder... implement me!   ****
       return false;
    }
    
    //Reacts to a single key press on the keyboard
    protected void reactToKey(int key){
        //if a splash screen is up, only react to the advance splash key
        if (getSplashImage() != null){
            if (key == ADVANCE_SPLASH_KEY)
                super.setSplashImage(null);
            return;
        }
  }    
  
    
    
    //Handles reacting to a single mouse click in the game window
    protected MouseEvent reactToMouseClick(MouseEvent click){
       
        //Mouse functionality is not used at all in the Simple game...
        //you may want to override this function for a CreativeGame feature though!

        return click;//returns the mouse event for any child classes overriding this method
    }    
        
}
