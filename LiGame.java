import java.awt.*;
import java.awt.event.*;
import java.util.*;


/**
 * LiGame is a Clash of Clans themed scrolling game.
 * Players control the Grand Warden to collect elixir while avoiding enemies.
 * 
 * Win Condition: Reach 300 points
 * Loss Conditions: 
 *   - HP reaches 0
 *   - Hit by 3 Hog Riders (HOGIFIED state)
 * 
 * Custom Features:
 *   - Spacebar dash forward
 *   - Hog Rider AI with acceleration
 *   - Dual loss condition system
 */
public class LiGame extends ScrollingGame{
    public static final String CLASH_SPLASH_FILE = "game_assets/clashSplash.jpeg";
    private static int width;
    private static int height;
    private int hogsHit = 0;
    protected static final int SPAWN_INTERVAL = 45;
    private static final int DASH_KEY = KeyEvent.VK_SPACE;

    public LiGame() {
        super();
    }

    public LiGame(int gameWidth, int gameHeight) {
        super(gameWidth, gameHeight);
        width = gameWidth;
        height = gameHeight;
    }

    protected void pregame() {
        this.setBackgroundImage("game_assets/background2.jpeg");
        player = new Warden(STARTING_PLAYER_X, STARTING_PLAYER_Y);
        displayList.add(player);
        score = 0;
        setSplashImage(CLASH_SPLASH_FILE);
    }

    

    // Called whenever it has been determined that the Player collided with a
    // consumable
    public void handlePlayerCollision(Consumable collidedWith) {
        if (player.isCollidingWith((Entity) collidedWith)) {
            score += collidedWith.getPoints();
            player.setHP(player.getHP() + collidedWith.getDamage());
            toBeGC.add((Entity) collidedWith);
            if (collidedWith instanceof HogRider)
                hogsHit ++;
        }
    }

    protected void postgame() {
        if (player.getHP() == 0) {
            super.setTitleText("Game is over! You LOSE!");
        }
        else if(hogsHit >= 3){
            super.setTitleText("Game is over! You were HOGIFIED");
        }
         else {
            super.setTitleText("Game is over! You WIN!");
        }
    }
    
    protected boolean isGameOver() {
        return super.isGameOver() || hogsHit >= 3;
    }

    protected void updateGame() {
        super.updateGame();
        setTitleText("HP:" + player.getHP() + ", Loots: " + score + ", hogs hit: " + hogsHit );
    } 

    public Entity generateRandomEntity(){
        Entity n;
        int randnumber = rand.nextInt(50);
            if (randnumber < 17) {
                n = new Elixir(getWindowWidth(), rand.nextInt(getWindowHeight() - Elixir.ELIXIR_HEIGHT));
            } else if (randnumber < 38) {
                n = new Barbarian(getWindowWidth(), rand.nextInt(getWindowHeight() - Barbarian.BARBARIAN_HEIGHT));
            }
            else if(randnumber < 45)
                n = new HogRider(getWindowWidth(), rand.nextInt(getWindowHeight() - HogRider.HOG_RIDER_HEIGHT));
            else {
                n = new DarkElixir(getWindowWidth(), rand.nextInt(getWindowHeight() - DarkElixir.ELIXIR_HEIGHT));
            }
        return n;
    }

    protected void reactToKey(int key) {
        // if a splash screen is up, only react to the advance splash key
        if (getSplashImage() == CLASH_SPLASH_FILE) {
            if (key == ADVANCE_SPLASH_KEY)
                super.setSplashImage("game_assets/explanation.png");
            return;
        }
        if(!isPaused && key == DASH_KEY){
            if(player.getX() + LiGame.getWidth()/4 < LiGame.getWidth() -player.getWidth())
                player.setX(player.getX() + LiGame.getWidth()/4 );
        }
        super.reactToKey(key);

    }


    public static int getWidth(){
        return width;
    }

    public static int getHeight(){
        return height;
    }

    protected MouseEvent reactToMouseClick(MouseEvent click) {
        

        return super.reactToMouseClick(click);
    }


}
