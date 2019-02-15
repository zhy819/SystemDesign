package com.ds.systemdesign.visitorpattern;

public class ParttimeEmployee implements Visitable
{
	private String name;
	private double hourWage;
	private int workTime;
 
	public ParttimeEmployee(String name,double hourWage,int workTime)
	{
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}	
 
	public void setName(String name) 
    {
		this.name = name; 
	}
 
	public void setHourWage(double hourWage) 
    {
		this.hourWage = hourWage; 
	}
 
	public void setWorkTime(int workTime) 
    {
		this.workTime = workTime; 
	}
 
	public String getName() 
    {
		return (this.name); 
	}
 
	public double getHourWage() 
    {
		return (this.hourWage); 
	}
 
	public int getWorkTime() 
    {
		return (this.workTime); 
	}
 
	public void accept(Visitor visitor)
    {
		visitor.visit(this);
    }
}