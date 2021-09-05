package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

import com.bridgelabz.linkedlistproblems.MyLinkedList;
import com.bridgelabz.linkedlistproblems.MyNode;

public class StockPortfolio 
{
	MyLinkedList<Stock> stock=new MyLinkedList<Stock>(); 
	double valueOfTotalStocks=0;
	public void readStockDetails() 
	{
		System.out.println("Enter the number of stocks");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		for(int index=0;index<number;index++)
		{
			System.out.println("Enter Share Name:");
			String name=scanner.next();
			System.out.println("Enter number of shares:");
			int numberOfShares=scanner.nextInt();
			System.out.println("Enter Share Price:");
			double sharePrice=scanner.nextDouble();
			Stock stockObject=new Stock(name, numberOfShares, sharePrice, 0);
			MyNode<Stock> node=new MyNode<Stock>(stockObject);
			stock.append(node);
		}
		
	}

	public void computeStockValue() 
	{
		MyNode<Stock> temporaryNode=(MyNode<Stock>) stock.head;
		while(temporaryNode!=null)
		{
			Stock current=temporaryNode.getKey();
			current.setValue(current.getNumberOfShares()*current.getSharePrice());
			valueOfTotalStocks+=current.getNumberOfShares()*current.getSharePrice();
			temporaryNode=(MyNode<Stock>) temporaryNode.getNext();
		}
		
	}

	public void display() 
	{
		stock.printMyNodes();
		System.out.println(" ");
		System.out.println("Value of Total Stocks:"+ valueOfTotalStocks);
	}

}
