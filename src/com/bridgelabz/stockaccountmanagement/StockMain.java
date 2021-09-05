package com.bridgelabz.stockaccountmanagement;

public class StockMain 
{
	public static void main(String[] args)
	{
		StockPortfolio stock=new StockPortfolio();
		stock.readStockDetails();
		System.out.println("Before computing each Stock value: ");
		stock.display();
		System.out.println("After computing each Stock value: ");
		stock.computeStockValue();
		stock.display();
	}
}
