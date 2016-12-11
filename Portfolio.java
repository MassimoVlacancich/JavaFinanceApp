
import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

public class Portfolio{
	

	private String ownerName;
	private String email;
	private int phoneNumber;
	private int accountNumber;
	private int registerValue;
	private static List<Transaction> transactionsList;
	private static List<Stock> stocksList;

	public static int totalAccounts = 0;

	public Portfolio(String name, String email, int pNumber, int account){
		this.ownerName = name;
		this.email = email;
		this.phoneNumber = pNumber;
		this.accountNumber = account;
		transactionsList = new ArrayList<Transaction>();
		stocksList = new ArrayList<Stock>();
		totalAccounts++;
		registerValue = totalAccounts;
	}

	public void displayPortfolio(){
		System.out.println(ownerName);
		System.out.println("email: " + email);
		System.out.println("phone: " + phoneNumber);
		System.out.println("account " + accountNumber);
		System.out.println("account n " + registerValue);
	}

	public void addTransaction(Transaction trans){
		transactionsList.add(trans);
	}

	public void addStock(String symbol){
		Stock stock = StockFetcher.getStock(symbol);
		stocksList.add(stock);
	}

	public void displayAllTransactions(){
		System.out.println("");
		System.out.println("");
		if(transactionsList.size() == 0){
			System.out.println("No transactions in the list");
		}
		else{
			for(int i = 0; i < transactionsList.size(); i++){
			Transaction temp = transactionsList.get(i);
			temp.displayInfo();
			System.out.println("");
			System.out.println("");
			}
		}
	}

	public void displayStock(Stock stock){
		System.out.println("The full name is: " + stock.getName());
		System.out.println("Price: " + stock.getPrice());
		System.out.println("Volume: " + stock.getVolume()); 
		System.out.println("P/E: " + stock.getPe());
		System.out.println("EPS: " + stock.getEps());
		System.out.println("Year Low: " + stock.getWeek52low());
		System.out.println("Year High: " + stock.getWeek52high());
		System.out.println("Day Low: " + stock.getDaylow());
		System.out.println("Day High: " + stock.getDayhigh());
		System.out.println("50 Day Moving Av: " + stock.getMovingav50day());
		System.out.println("Market Cap: " + stock.getMarketcap());
		System.out.println("The currency is: " + stock.getCurrency());
		System.out.println("The short ratio is: " + stock.getShortRatio());
		System.out.println("The previous close was: " + stock.getPreviousClose());
		System.out.println("The open for today was: " + stock.getOpen());
		System.out.println("The exchange is " + stock.getExchange());
	}

	public void displayAllStocks(){

		if(stocksList.size() == 0){
			System.out.println("No stocks in the list");
		}
		else{
			for(int i = 0; i < stocksList.size(); i++){
			Stock temp = stocksList.get(i);
			displayStock(temp);
			System.out.println("");
			System.out.println("");
			}
		}
	}


}