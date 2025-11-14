//Avoids are entities the player needs to avoid colliding with.
//If a player collides with an avoid, it reduces the players Hit Points (HP).
public class Barbarian extends Entity implements Consumable, Scrollable{

    // Location of image file to be drawn for an Avoid
    public static final String BARBARIAN_IMAGE_FILE = "game_assets/barbarian.png";
    // Dimensions of the Avoid
    public static final int BARBARIAN_WIDTH = LiGame.getWidth()/9;
    public static final int BARBARIAN_HEIGHT = LiGame.getWidth()/9;
    // Speed that the avoid moves each time the game scrolls
    public static final int BARBARIAN_DEFAULT_SCROLL_SPEED = 5;

    private int scrollSpeed = BARBARIAN_DEFAULT_SCROLL_SPEED;

    public Barbarian() {
        this(0, 0);
    }

    public Barbarian(int x, int y) {
        super(x, y, BARBARIAN_WIDTH, BARBARIAN_HEIGHT, BARBARIAN_IMAGE_FILE);
    }

    public int getScrollSpeed() {
        return this.scrollSpeed;
    }

    // Sets the scroll speed to the argument amount
    public void setScrollSpeed(int newSpeed) {
        this.scrollSpeed = newSpeed;
    }

    // Move the avoid left by the scroll speed
    public void scroll() {
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

