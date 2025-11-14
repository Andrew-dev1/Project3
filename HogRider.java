import java.util.*;

/**
 * HogRider is an advanced enemy entity that accelerates toward the player.
 * When a HogRider reaches a random trigger point, it doubles its speed,
 * making it harder to avoid. Hitting 3 Hog Riders results in instant defeat.
 */
public class HogRider extends Entity implements Consumable, Scrollable {
    
    // Location of image file to be drawn for an Archer
    public static final String HOG_RIDER_IMAGE_FILE = "game_assets/hogRider.png";
    // Dimensions of the HOG RIDER
    public static int HOG_RIDER_WIDTH = LiGame.getWidth()/9;
    public static int HOG_RIDER_HEIGHT = LiGame.getWidth()/9;
    // Speed that the avoid moves each time the game scrolls
    public static final int HOG_RIDER_DEFAULT_SCROLL_SPEED = 5;
    private boolean rushing = false;
    Random rand = new Random();
    private int rushPoint;

    private int scrollSpeed = HOG_RIDER_DEFAULT_SCROLL_SPEED;

    public HogRider() {
        this(0, 0);
    }

    public HogRider(int x, int y) {
        super(x, y, HOG_RIDER_WIDTH, HOG_RIDER_HEIGHT, HOG_RIDER_IMAGE_FILE);
        rushPoint = rand.nextInt(LiGame.getWidth()/2, LiGame.getWidth()) ;
    }

    public int getScrollSpeed() {
        return this.scrollSpeed;
    }

    // Sets the scroll speed to the argument amount
    public void setScrollSpeed(int newSpeed){
        this.scrollSpeed = newSpeed;
    }

    // Move the avoid left by the scroll speed
    public void scroll() {
        if(!rushing && getX() <= rushPoint){
            scrollSpeed += scrollSpeed;
            rushing = true;
        }
        setX(getX() - this.scrollSpeed);
    }

    // Colliding with an Avoid does not affect the player's score
    public int getPoints() {
        return 0;
    }

    // Colliding with an Avoid Reduces players HP by 1
    public int getDamage() {
        return -1;
    }


}
