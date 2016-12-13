import java.util.Scanner;

public class GUIHelper{
	
	static int displayMenu(){

			Scanner input = new Scanner(System.in);
			int choice=0;
			int i = 0;
			while(choice < 1 || choice > 4){
				System.out.println("Menu: select an option");
			    System.out.println("[1] search stock   [2] Display portfolio   [3] Add stock " );
			    System.out.println("[4] exit   " );
			    String value = input.next();
			    choice = Integer.parseInt(value);	
			}
			return choice;
		}

	static String getSymbol(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter stock' symbol:  ");
		String value = input.next();
		return value;
	}

	static void displayTableIndex(){
		System.out.println("      NAME      PRICE    PE    EPS   52wL    52w H     dayOpen  ");
	}
}