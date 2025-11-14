# Clash of Clans Scrolling Game

A Java-based side-scrolling game inspired by Clash of Clans, where players control the Grand Warden to collect elixir while avoiding enemy troops.

![Game Theme](game_assets/clashSplash.jpeg)

## 🎮 Game Overview

Navigate the Grand Warden through a battlefield, collecting elixir to power up while dodging Barbarians and the dangerous Hog Riders. Use strategic dash moves to avoid enemies and reach your goal!

### Objective
- **Win Condition**: Collect 300 points worth of elixir
- **Loss Conditions**: 
  - Lose all HP (3 hits)
  - Get hit by 3 Hog Riders (instant "HOGIFIED" defeat)

## ✨ Features

### Standard Gameplay
- Smooth scrolling gameplay with collision detection
- HP system with visual feedback
- Score tracking
- Speed controls (speed up/slow down gameplay)
- Pause functionality
- Debug mode for development

### Custom Features
- **Dash Forward**: Press SPACEBAR to dash forward 1/4 of the screen width
- **Hog Rider AI**: Hog Riders accelerate when they get close to the player
- **Dual Loss Condition**: Unique "HOGIFIED" defeat state after 3 Hog Rider hits
- **Custom Theme**: Full Clash of Clans aesthetic with themed sprites and backgrounds

## 🎯 Game Entities

| Entity | Points | HP Effect | Description |
|--------|--------|-----------|-------------|
| **Elixir** (Purple) | +5 | 0 | Standard collectible for points |
| **Dark Elixir** (Black) | +5 | +1 | Rare collectible that restores HP |
| **Barbarian** | 0 | -1 | Basic enemy to avoid |
| **Hog Rider** | 0 | -1 | Advanced enemy that accelerates when near player |

## 🎮 Controls

| Key | Action |
|-----|--------|
| **↑ ↓ ← →** | Move the Grand Warden |
| **SPACEBAR** | Dash forward |
| **ENTER** | Start game / Advance splash screens |
| **P** | Pause/Unpause |
| **+** | Increase game speed |
| **-** | Decrease game speed |
| **D** | Toggle debug mode |
| **ESC** | Quit game |

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/clash-scrolling-game.git
cd clash-scrolling-game
```

2. Compile the Java files:
```bash
javac *.java
```

3. Run the game:
```bash
java Launcher
```

### Project Structure
```
clash-scrolling-game/
├── game_assets/          # Images and sprites
│   ├── clashSplash.jpeg
│   ├── background2.jpeg
│   ├── grandWarden.gif
│   ├── barbarian.png
│   ├── hogRider.png
│   ├── Elixir.png
│   └── darkElixir.PNG
├── Launcher.java         # Main entry point
├── LiGame.java          # Custom game implementation
├── ScrollingGame.java   # Base scrolling game logic
├── GameEngine.java      # Core game engine (DO NOT MODIFY)
├── GameWindow.java      # Window rendering (DO NOT MODIFY)
├── Entity.java          # Base entity class
├── Player.java          # Player base class
├── Warden.java          # Custom player (Grand Warden)
├── Consumable.java      # Interface for collectibles
├── Scrollable.java      # Interface for scrolling entities
├── Elixir.java          # Standard elixir collectible
├── DarkElixir.java      # HP-restoring collectible
├── Avoid.java           # Basic enemy
├── Barbarian.java       # Themed basic enemy
├── HogRider.java        # Advanced enemy with AI
└── README.md
```

## 🎨 Design Decisions

### Why Clash of Clans?
The theme was chosen to create an engaging visual experience while maintaining clear gameplay mechanics. The Clash of Clans universe provides:
- Recognizable characters for intuitive gameplay
- Clear visual distinction between collectibles and enemies
- Thematic consistency across all game elements

### Custom Features Rationale
- **Dash Mechanic**: Adds strategic depth, allowing skilled players to escape dangerous situations
- **Hog Rider Acceleration**: Creates dynamic difficulty and tension as enemies approach
- **HOGIFIED State**: Adds a unique twist to the standard loss condition, encouraging players to specifically avoid Hog Riders

## 🛠️ Technical Implementation

### Key Design Patterns
- **Inheritance**: Entity base class extended by all game objects
- **Interfaces**: Consumable and Scrollable for polymorphic behavior
- **Composition**: GameEngine contains Entity collections
- **MVC Pattern**: Separation of game logic, rendering, and input handling

### Entity Spawning Algorithm
Entities spawn at regular intervals with:
- Random entity type selection based on weighted probabilities
- Collision detection to prevent overlapping spawns
- Dynamic positioning across the game window height

## 📝 Code Quality Improvements Made

- Consistent naming conventions
- Clear documentation comments
- Proper encapsulation of game state
- Modular design for easy extension

## 🎓 Learning Outcomes

This project demonstrates:
- Object-oriented programming principles
- Game loop architecture
- Collision detection algorithms
- Event-driven programming
- Java Swing/AWT graphics

## 📜 Assets Attribution

- **Splash Screen**: [ArtStation - Clash of Clans Artwork](https://www.artstation.com/artwork/rJLPx2)
- **Barbarian**: [PlusPNG - Clash of Clans HD PNG](https://pluspng.com/clash-of-clans-hd-png-6957.html)
- **Background**: [Clash of Clans Fandom - Scenery](https://clashofclans.fandom.com/wiki/Scenery)
- **Grand Warden**: [Reddit - Gladiator Warden Render](https://www.reddit.com/r/ClashOfClans/comments/himhka/miscgladiator_warden_render_transparent/)
- **Rules Background**: [Pocket Gamer - Clash of Clans Update](https://www.pocketgamer.com/clash-of-clans/update-free-troop-training-and-more/)
- **Elixir**: [Clash Royale Fandom - Elixir](https://clashroyale.fandom.com/wiki/Elixir)
- **Dark Elixir**: [Redbubble - Dark Elixir Art](https://www.redbubble.com/i/metal-print/Dark-Elixir-Art-by-drojo11/18194318.0JXQP)
- **Hog Rider**: [NicePNG - Clash Royale Hog Rider](https://www.nicepng.com/ourpic/u2q8q8i1w7o0q8q8_clashroyalestrats-clash-royale-hog-rider-png/)

## 🤝 Contributing

This is an educational project, but suggestions and improvements are welcome! Feel free to:
1. Fork the repository
2. Create a feature branch
3. Submit a pull request

## 📄 License

This project is for educational purposes. All Clash of Clans assets and trademarks belong to Supercell.

## 👤 Author

Created as a Java programming project demonstrating object-oriented design and game development principles.

---



sources:
splash screen: https://www.artstation.com/artwork/rJLPx2
barbarian: https://pluspng.com/clash-of-clans-hd-png-6957.html
background: https://clashofclans.fandom.com/wiki/Scenery
warden: https://www.reddit.com/r/ClashOfClans/comments/himhka/miscgladiator_warden_render_transparent/
rules background: https://www.pocketgamer.com/clash-of-clans/update-free-troop-training-and-more/
elixir: https://clashroyale.fandom.com/wiki/Elixir
dark elixir: https://www.redbubble.com/i/metal-print/Dark-Elixir-Art-by-drojo11/18194318.0JXQP
hog: https://www.nicepng.com/ourpic/u2q8q8i1w7o0q8q8_clashroyalestrats-clash-royale-hog-rider-png/