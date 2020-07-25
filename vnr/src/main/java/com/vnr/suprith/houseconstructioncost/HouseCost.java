package com.vnr.suprith.houseconstructioncost;

public class HouseCost {
	public double calculateHouseCost(String MaterialType,double AreaOfHouse)
	{
		if(MaterialType=="Standard Material")
			return(AreaOfHouse*1200);
		else if(MaterialType=="Above Standard Material")
			return(AreaOfHouse*1500);
		else if(MaterialType=="High Standard Material")
			return(AreaOfHouse*1800);
		else if(MaterialType=="High Standard Material and Fully Automated")
			return(AreaOfHouse*2500);
		else
			return(0.0);
	}
}
