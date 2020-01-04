package com.intercom.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.intercom.dao.FileReaderDao;
import com.intercom.domain.Customer;
import com.intercom.helper.DistanceHelper;

public class App {

	public static void main(String[] args){
		
		FileReaderDao frd = new FileReaderDao();
		List<Customer> customers= frd.extractCustomersFromFile("./customers.txt");
		DistanceHelper distanceHel= new DistanceHelper();
		List<Customer> sortCustomers= new ArrayList<Customer>();
		for(Customer cust : customers)
		{
			if(distanceHel.distance(cust.getLatitude(), cust.getLongitude())<100)
				sortCustomers.add(cust);
		}
		Collections.sort(sortCustomers);
		for(Customer cust : sortCustomers)
		{
			System.out.println("ID : "+cust.getUser_id()+" | Name : "+cust.getName());
		}
	}
}
