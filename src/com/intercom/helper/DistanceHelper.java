package com.intercom.helper;

public class DistanceHelper {

	private static final double refLat = Math.toRadians(53.339428);
	
	private static final double refLon = Math.toRadians(-6.257664);
	
	private static final double earthRad = 6378;
	
	private double lat;
	
	private double lon;
	
	private double deltaLon;
	
	public double distance(double clat,double clon){
		
		if(Math.abs(clat)>90){
			System.out.println("Invalid value of Latitude, latitude has to be between -90 to 90 but found : "+clat);
			return -1;
		}
		if(Math.abs(clon)>180){
			System.out.println("Invalid value of Longitude, longitude has to be between -180 to 180 but found : "+clat);
			return -1;
		}
		lat= Math.toRadians(clat);
		lon= Math.toRadians(clon);
		deltaLon= Math.abs(lon-refLon);
		
		return (Math.acos((Math.sin(lat)*Math.sin(refLat))+(Math.cos(lat)*Math.cos(refLat)*Math.cos(deltaLon)))*earthRad); 
		
	}
}
