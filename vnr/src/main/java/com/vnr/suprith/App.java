package com.vnr.suprith;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

import com.vnr.suprith.houseconstructioncost.*;
import com.vnr.suprith.interestcalculation.*;

public class App 
{
    public static void main(String[] args )
    {
    	SimpleInterest simpleinterest=new SimpleInterest();
    	double ans1=simpleinterest.calculateSimpleInterest(1000,2,5);
    	final Logger LOGGER1 = LogManager.getLogger(SimpleInterest.class.getName());
    	LOGGER1.debug("This is log info of SimpleInterest .The simple interest is given below");
    	LOGGER1.info("Simple Interest= "+ans1);
    	
    	CompoundInterest compoundinterest=new CompoundInterest();
    	double ans2=compoundinterest.calculateCompoundInterest(1000,2,5);
    	final Logger LOGGER2 = LogManager.getLogger(CompoundInterest.class.getName());
    	LOGGER2.debug("This is log info of CompoundInterest .The compound interest is given below");
    	LOGGER2.info("Compound Interest= "+ans2);
    	
    	
    	HouseCost housecost=new HouseCost();
    	double cost=housecost.calculateHouseCost("Above Standard Material", 25.0);
    	final Logger LOGGER3 = LogManager.getLogger(HouseCost.class.getName());
    	LOGGER3.debug("This is log info of house estimation cost .The cost is given below");
    	LOGGER3.info("House construction cost= "+cost);
    }
}
