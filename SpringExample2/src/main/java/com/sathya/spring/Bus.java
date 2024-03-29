package com.sathya.spring;

public class Bus implements Vehicle 
{
   private String bustype;
   private int maxSpeed;
   
   
	public String getBustype() {
	return bustype;
}


public void setBustype(String bustype) {
	this.bustype = bustype;
}


public int getMaxSpeed() {
	return maxSpeed;
}


public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}


	@Override
	public void move() 
	{
		System.out.println("your selected Bus vehicle");
		System.out.println("maxSpeed..."+maxSpeed);
		System.out.println("bustype..."+bustype);
	}

}
