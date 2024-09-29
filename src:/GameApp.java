package Game;

import javax.swing.*;

public class GameApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Game game = new Game();
            game.startGame();
        });
    }
}
