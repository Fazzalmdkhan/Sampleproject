package com.arrays.java;

import java.util.ArrayList;

	
public class Vehicle {
	
		String location;
		int speed;
		int stopdistance;
		String sensingofvehicle;
		//https://www.youtube.com/watch?v=W31m1Z4RlvQ&t=115s

public void vehicle () {
	
	Vehicle v1 = new Vehicle ();
	v1.location="Hyderabad";
	v1.speed=50;
	v1.stopdistance=10;
	v1.sensingofvehicle = "Yes";
	
	Vehicle v2 = new Vehicle ();
	v2.location="Delhi";
	v2.speed=100;
	v2.stopdistance=15;
	v2.sensingofvehicle = "No";
	
	Vehicle v3 = new Vehicle ();
	v3.location="UP";
	v3.speed=300;
	v3.stopdistance=5;
	v3.sensingofvehicle = "Yes";

	
	
	ArrayList<Vehicle> vl = new ArrayList<Vehicle>();
	
	vl.add(v1);
	vl.add(v2);	 	
	vl.add(v3);	
	
	
        for (int i=0;i<vl.size();i++) {
        	
         	System.out.print(vl.get(i).location+ "  ");
         	System.out.print(vl.get(i).speed+ "  ");
         	System.out.print(vl.get(i).stopdistance+ "  ");
         	System.out.print(vl.get(i).sensingofvehicle+ " ");
         	System.out.println();
         	        	
}
}
}
