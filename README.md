A fun light-hearted game that simulates the struggles of dating. Interact with a wide range of quirky characters by playing the game more than once! Each ending is a new surprise.

Coded in Java
overview of project 

 DatingSimulator/
│
├── src/
│   ├── GameApp.java               # Main application file
│   ├── GameState.java             # Manages game state (e.g., player progress)
│   ├── Character.java             # Character attributes and methods
│   ├── DatabaseManager.java       # Manages database connections and queries
│   ├── ConversationManager.java    # Manages character dialogues
│   └── utils/
│       └── Constants.java         # Constant values for the game
│
├── terraform/
│   └── main.tf                   # Terraform script for infrastructure
│
├── res/
│   ├── images/                    # Character images
│   │   ├── bot1.jpg                # Image for bot character 1
│   │   └── bot2.jpg               # Image for bot character 2
│   ├── css/                       # CSS files for styling
│   │   ├── styles.css             # General styles
│   │   └── buttons.css            # Button styles
│   └── fxml/                      # FXML files for JavaFX UI (if using FXML)
│       ├── main_scene.fxml         # Main game scene layout
│       └── title_scene.fxml        # Title screen layout
│
├── frontend/                      # React frontend (if applicable)
│   ├── src/
│   │   ├── components/            # React components
│   │   │   ├── TitleScreen.js     # Title screen component
│   │   │   ├── GameScreen.js      # Game screen component
│   │   │   └── CharacterDialog.js  # Character dialog component
│   │   ├── App.js                 # Main React application file
│   │   └── index.js               # Entry point for React
│   └── public/
│       ├── index.html             # Main HTML file
│       └── styles.css             # Global styles for React
│
└── pom.xml                        # Maven configuration (if using Maven)
