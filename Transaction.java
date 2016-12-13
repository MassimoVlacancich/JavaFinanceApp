import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Transaction{

	private double buyRate;
	private double sellRate;
	private String companyName;
	
	public Transaction(String companyName, double buyRate, double sellRate){
		this.buyRate = buyRate;
		this.sellRate = sellRate;
		this.companyName = companyName;
	}

	public void setCompanyName (String name){
		this.companyName = name;
	}

	public void setBuyRate (double rate){
		this.buyRate = rate;
	}

	public void setSellRate (double rate){
		this.sellRate = rate;
	}

	public String getCompanyName (){
		System.out.println(this.companyName);
		return this.companyName;
	}

	public double getBuyRate (){
		System.out.println(this.buyRate);
		return this.buyRate;
	}

	public double getSellRate (){
		System.out.println(this.sellRate);
		return this.sellRate;
	}

	public double earnings(){
		System.out.printf("%.2f",(sellRate - buyRate));
		return (sellRate - buyRate);
	}

	public void displayInfo(){
		System.out.printf(companyName + " was bought for: ");
		System.out.println(buyRate + "$");
		System.out.println("sold for " + sellRate + "$");
		System.out.printf("with gain/loss of ");
		System.out.printf("%.2f",(sellRate - buyRate));
		System.out.printf("$");
	}

	
}