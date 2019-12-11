package satwikgrp.satwikartid;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updating {
	Scanner s = new Scanner(System.in);
	String date, costumerid, debit,credit,balance,transaction_date;
	
	public int Update(Connection con)
	{
		System.out.println("--------------UPDATE---------------------");
		int z = 0;
		Connection C = con;
		
		try {
		Date obj = new Date();
		date = obj.toString();
		System.out.print("Enter the Id: ");
		costumerid = s.next();
		System.out.print("Enter the Credit amount : ");
		credit = s.next();
		System.out.print("Enter the Debit amount : ");
		debit = s.next();
		System.out.print("Enter the balance : ");
		balance = s.next();
		PreparedStatement update = C.prepareStatement("Update costumer_trans_log Set credit = ? , debit = ? , balance = ?, transaction_date = ?  where costumer_id = ?");
		update.setString(1,credit);
		update.setString(2,debit);
		update.setString(3,balance);
		update.setString(4,date);
		update.setString(5,costumerid);
		z = update.executeUpdate();//return the total number of instances to be Updated
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return z;
	}

}
