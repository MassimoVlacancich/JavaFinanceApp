import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.Scanner;

public class Run{

		public static void main(String[] args) {
			System.out.println("Welcome to your investment portfolio");
			Portfolio myP = new Portfolio("DocMaxCash", "vox@gmail.com", 7490, 2214);

			int choice = displayMenu();



			myP.displayPortfolio();
			myP.addStock("FB");
			myP.displayAllStocks();
		}

		public int displayMenu(){

			Scanner input = new Scanner(System.in);
			
			int i = 0;
			while(choice < 1 || choie > 3){
				System.out.println("Menu: select an option");
			    System.out.println("[1] search stock   [2] Display portfolio   [3] Add stock " );
			    String choice = input.next();					
			}
			return Integer.parseInt(choice);
		}



}