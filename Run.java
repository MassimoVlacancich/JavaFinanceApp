import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.Scanner;
import java.awt.event.*;




public class Run{


	private static int exit = 0;
	private static String symbol;

	private static JFrame mainFrame;
    private static JPanel loginPanel;
    //private static JButton submit;


	public static void main(String[] args) {
		setUpGUI();
		System.out.println("Welcome to your investment portfolio");
		Portfolio myP = new Portfolio("DocMaxCash", "vox@gmail.com", 7490, 2214);
		int choice = 0;
		while(exit != 1){
			choice = GUIHelper.displayMenu();
			switch(choice){
			case 1: symbol = GUIHelper.getSymbol();
			        GUIHelper.displayTableIndex();
					myP.displayStock(StockFetcher.getStock(symbol));
					break;

			case 2: myP.displayPortfolio();
					break;

			case 3: symbol = GUIHelper.getSymbol();
					myP.addStock(symbol);
					break;

			case 4: exit = 1;
					break;
			}

		}

	}

	private static void setUpGUI(){
	      	mainFrame = new JFrame("Personal Portfolio");
	      	mainFrame.setSize(400,200);
	      	mainFrame.addWindowListener(new WindowAdapter() {
	        	 public void windowClosing(WindowEvent windowEvent){
	            	System.exit(0);
	         	}        
	      	});    
	      	
	      	//PANELS
	      	loginPanel = new JPanel();
	      	SpringLayout layout = new SpringLayout();
	      	loginPanel.setSize(400,200);
	        loginPanel.setLayout(layout);


	      	//LABELS
	      	JLabel usernameL = new JLabel("Username");
	      	JLabel pwdL = new JLabel("Password");

	      	//TEXTFIELDS
	      	JTextField usernameTF = new JTextField("", 15);
	      	JTextField pwdTF = new JTextField("", 15);

	      	//BUTTONS
	      	JButton submit = new JButton ("LOGIN");
	      	
	        //ADD to login panel
	        loginPanel.add(usernameL);
	        loginPanel.add(usernameTF);
	        loginPanel.add(pwdL);
	        loginPanel.add(pwdTF);
	        loginPanel.add(submit);

	        //ADJUST POSITION AND SIZE OF ELEMENTS
	        layout.putConstraint(SpringLayout.WEST, usernameL,10,SpringLayout.WEST, loginPanel);
			layout.putConstraint(SpringLayout.NORTH, usernameL,5,SpringLayout.NORTH, loginPanel);

			layout.putConstraint(SpringLayout.WEST, usernameTF,10,SpringLayout.EAST, usernameL);
			layout.putConstraint(SpringLayout.NORTH, usernameTF,5,SpringLayout.NORTH, loginPanel);

			layout.putConstraint(SpringLayout.WEST, pwdL,10,SpringLayout.WEST, loginPanel);
			layout.putConstraint(SpringLayout.NORTH, pwdL,40,SpringLayout.NORTH, loginPanel);

			layout.putConstraint(SpringLayout.WEST, pwdTF,10,SpringLayout.EAST, pwdL);
			layout.putConstraint(SpringLayout.NORTH, pwdTF,40,SpringLayout.NORTH, loginPanel);

		


	        mainFrame.add(loginPanel);
	        //mainFrame.pack();
	        mainFrame.setVisible(true);  
		}
}