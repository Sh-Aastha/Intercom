package com.intercom.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intercom.domain.Customer;

public class FileReaderDao {

	ObjectMapper obj = new ObjectMapper();
	
	public List<Customer> extractCustomersFromFile(String filename){
	
		List<Customer> customers = new ArrayList<Customer>();

		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null){
			Customer cust = obj.readValue(line, Customer.class);
			customers.add(cust);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error reading file : "+filename+" Error is "+e.getMessage());
		}
		return customers;
	}
	
}
