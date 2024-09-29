package Game;

import java.util.Scanner;

public class Game {
    private GameState gameState;
    private ConversationManager conversationManager;
    private static Scanner scanner = new Scanner(System.in);
    private Choice currentChoice;

    public Game() {
        gameState = new GameState();
        conversationManager = new ConversationManager();
    }

    public void startGame() {
        System.out.println("Welcome to the Dating Simulator!");
        createChoices();
        gameLoop();
    }

    private void createChoices() {
        // Create choices and sub-choices
        Choice start = new Choice("You encounter a character. What do you want to do?");
        Choice talk = new Choice("Talk to the character.");
        Choice walkAway = new Choice("Walk away from the character.");

        // Additional options can be added here
        start.addOption(talk);
        start.addOption(walkAway);

        currentChoice = start;
    }

    private void gameLoop() {
        while (true) {
            presentChoices();
            int choiceIndex = getUserChoice();

            if (choiceIndex >= 0 && choiceIndex < currentChoice.getOptions().size()) {
                currentChoice = currentChoice.getOptions().get(choiceIndex);
                handleChoice(currentChoice);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void presentChoices() {
        System.out.println(currentChoice.getDescription());
        for (int i = 0; i < currentChoice.getOptions().size(); i++) {
            System.out.println((i + 1) + ". " + currentChoice.getOptions().get(i).getDescription());
        }
    }

    private int getUserChoice() {
        System.out.print("Enter your choice (1-" + currentChoice.getOptions().size() + "): ");
        int choice = scanner.nextInt() - 1;

        // Validate user input
        return (choice >= 0 && choice < currentChoice.getOptions().size()) ? choice : -1;
    }

    private void handleChoice(Choice selectedChoice) {
        switch (selectedChoice.getDescription()) {
            case "Talk to the character.":
                System.out.println("You talked to the character.");
                // Add further dialogue or actions here
                break;
            case "Walk away from the character.":
                System.out.println("You chose to walk away.");
                // Add logic for walking away if necessary
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
