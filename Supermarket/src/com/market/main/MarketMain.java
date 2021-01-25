package com.market.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.market.Bean.Bean;
import com.market.crudoperations.MarketCRUD;

public class MarketMain {
	public static void main(String args[]) throws Exception
	{
		Scanner s= new Scanner(System.in);
		Bean b = new Bean();
		MarketCRUD m=new MarketCRUD();
		while(true) {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.TOTAL COST");
			System.out.println("4.EXIT");
			System.out.println("Enter your choice : ");
			int i = s.nextInt();
			switch(i) {
			case 1 :
				System.out.println("Enter Item Id");
				int id =s.nextInt();
				b.setItemid(id);
				System.out.println("Enter Item Name");
				String name =s.next();
				b.setItemname(name);
				System.out.println("Enter Cost Of Item");
				float item=s.nextFloat();
				b.setCostofitem(item);
				int insertion = m.Insert(b);
				if(insertion > 0)
				{
					System.out.println("Insertion Is Successful");
				}
				else
				{
					System.out.println("Insertion Is Unsuccessful");
				}
				break;
				
			case 2 :
				m.Display();
				break;
				
			case 3 :
				m.Totalcost();
				break;
				
			case 4 :
				System.exit(0);
				
			default :
				System.out.println("Invalid");
			}
		}
	}

}
