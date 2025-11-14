public class DarkElixir extends Elixir{
    
    // Location of image file to be drawn for a RareGet
    public static final String DARK_ELIXIR_IMAGE_FILE = "game_assets/darkElixir.PNG";

    public DarkElixir() {
        this(0, 0);
    }

    public DarkElixir(int x, int y) {
        super(x, y, DARK_ELIXIR_IMAGE_FILE);
    }

    // Colliding with a RareGet does not affect the player's HP
    public int getDamage() {
        return 1;
    }
    
    
}
