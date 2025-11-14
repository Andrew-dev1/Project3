//Gets are entities that the player wants to collide with, as they increase
//their score.
public class Elixir extends Entity implements Consumable, Scrollable {
    
    //Location of image file to be drawn for a Get
    public static final String ELIXIR_IMAGE_FILE = "game_assets/Elixir.png";
    //Dimensions of the Get  
    public static final int ELIXIR_WIDTH = LiGame.getWidth()/14;
    public static final int ELIXIR_HEIGHT = LiGame.getWidth()/14;
    //Speed that the Get moves (in pixels) each time the game scrolls
    public static final int ELIXIR_DEFAULT_SCROLL_SPEED = 5;
    //Amount of points received when player collides with a Elixir
    public static final int ELIXIR_POINT_VALUE = 5;
    
    private int scrollSpeed = ELIXIR_DEFAULT_SCROLL_SPEED;
    
    public Elixir(){
        this(0, 0);
    }
    
    public Elixir(int x, int y){
        super(x, y, ELIXIR_WIDTH, ELIXIR_HEIGHT, ELIXIR_IMAGE_FILE);  
    }

    public Elixir(int x, int y, String filename){
        super(x, y, ELIXIR_WIDTH, ELIXIR_HEIGHT, filename);  
    }
    
    public int getScrollSpeed(){
        return this.scrollSpeed;
    }
    
    //Sets the scroll speed to the argument amount
    public void setScrollSpeed(int newSpeed){
       this.scrollSpeed = newSpeed;
    }
    
    //Move the Get left by its scroll speed
    public void scroll(){
        setX(getX() - this.scrollSpeed);
    }
    
    //Colliding with a Get increases the player's score by the specified amount
    public int getPoints(){
        return ELIXIR_POINT_VALUE;
    }
    
    //Colliding with a Get does not affect the player's HP
    public int getDamage(){
        return 0;
    }
    
}
