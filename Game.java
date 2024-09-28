package Game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.*;
	import java.awt.*;
import java.net.URL;

public class Game {
	
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, picturePanel ;
	JLabel titleNameLabel, lvLabel, lvLabelNumber, lvLabelName, itemLabel, itemLabelName, pictureLabel;
	Font titleFont = new Font("Menlos", Font.BOLD, 70);
	Font normalFont = new Font("Menlos", Font.BOLD, 28);
	Font textFont = new Font("Menlos", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int playerLV;
	String item, position;
	Container con;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	ImageIcon Image;

	public static void main(String[] args) {
		new Game();
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(".\\res\\dog.jpg"));
		Dimension size = label.getPreferredSize();
		label.setBounds(50, 30, size.width, size.height);
		label.setVisible(true);
		
	}
	public Game() {
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.pink);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(null);
		titleNameLabel = new JLabel("Dating Simulator");
		titleNameLabel.setForeground(Color.black);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(null);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
			
		//pictureLabel.setIcon(img);
		//picturePanel.add(pictureLabel);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		window.setVisible(true);
	
	}

	public void createGameScreen() {
		
		titleNameLabel.setVisible(false);
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 240);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(textFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);	
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4, 1));
		con.add(choiceButtonPanel);
		
		//Choice Buttons
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choiceButtonPanel.add(choice1);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choiceButtonPanel.add(choice2);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choiceButtonPanel.add(choice3);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choiceButtonPanel.add(choice4);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 50, 600, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		
		lvLabel = new JLabel("LV:");
		lvLabel.setFont(textFont);
		lvLabel.setForeground(Color.white);
		playerPanel.add(lvLabel);
		lvLabelNumber = new JLabel();
		lvLabelNumber.setFont(normalFont);
		lvLabelNumber.setFont(textFont);
		lvLabelNumber.setForeground(Color.white);
		playerPanel.add(lvLabelNumber);
		
		itemLabel = new JLabel("Item:");
		itemLabel.setFont(textFont);
		itemLabel.setForeground(Color.white);
		playerPanel.add(itemLabel);
		itemLabelName = new JLabel();
		itemLabelName.setFont(textFont);
		itemLabelName.setForeground(Color.white);
		playerPanel.add(itemLabelName);
		

		playerSetup();
		
	}
	
	public void playerSetup() {
		playerLV = 15;
		item = "Flower";
		itemLabelName.setText(item);
		lvLabelNumber.setText("" + playerLV);
		lvLabelName.setText("" + item);
	
	}
	
	public void schoolGate() {
		position = "schoolGate";
		mainTextArea.setText("You are walking up to the school gates when suddenly someone bumps into you. You look up and see a cute boy... What do you do?");
		mainTextArea.setVisible(true);
		
		choice1.setText("Talk to him");
		choice2.setText("Walk away");
		choice3.setText("Roll your eyes at him");
        choice4.setText("");
	}
	
	public void talkBoy() {
		position = "talkBoy";
		mainTextArea.setText("Boy: Oh, sorry about that!");
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
        choice4.setText("");
		
	}
	public class TitleScreenHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}

	}
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			String yourChoice = event.getActionCommand();
			
			if(yourChoice.equals("c1")&& position == "schoolGate") {
			talkBoy();
			
			}
			
		}
	}
	

	public class ImagePanel extends JPanel {
	    private Image image;

	    public ImagePanel(String imagePath) {
	        // Load the image from the file
	        ImageIcon icon = new ImageIcon(imagePath);
	        image = icon.getImage();
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        // Draw the image
	        g.drawImage(image, 0, 0, this);
	    }
	public class ImageViewer {
	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("Image Viewer");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800, 600); // Set the size of the frame

	        // Create an instance of the custom JPanel with the image path
	        ImagePanel imagePanel = new ImagePanel("path/to/your/dog.jpg");
	        
	        // Add the custom JPanel to the frame
	        frame.add(imagePanel);
	        
	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}



	}

}