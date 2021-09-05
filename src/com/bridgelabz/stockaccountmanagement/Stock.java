package com.bridgelabz.stockaccountmanagement;

public class Stock 
{
	public String name;
	public int numberOfShares;
	public double sharePrice;
	public double value;
	
	public Stock(String name, int numberOfShares, double sharePrice, double value) 
	{
		super();
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
		this.value = value;
	}
	public String getName() 
	{
		return name;
	}
	public int getNumberOfShares() 
	{
		return numberOfShares;
	}
	public double getSharePrice() 
	{
		return sharePrice;
	}
	public double getValue() 
	{
		return value;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setNumberOfShares(int numberOfShares) 
	{
		this.numberOfShares = numberOfShares;
	}
	public void setSharePrice(double sharePrice) 
	{
		this.sharePrice = sharePrice;
	}
	public void setValue(double value) 
	{
		this.value = value;
	}
	@Override
	public String toString() 
	{
		return "Stock [name=" + name + ", numberOfShares=" + numberOfShares + ", sharePrice=" + sharePrice + ", value="
				+ value + "]";
	}
	
}
