import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.Scanner;

public class Run{

	private static int exit = 0;
	private static String symbol;

	public static void main(String[] args) {
		System.out.println("Welcome to your investment portfolio");
		Portfolio myP = new Portfolio("DocMaxCash", "vox@gmail.com", 7490, 2214);
		int choice = GUIHelper.displayMenu();
		while(exit != 1){
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
}