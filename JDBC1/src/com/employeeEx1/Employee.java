package com.employeeEx1;

public class Employee {
	
private Integer id;
private String name;

public Integer getId()
{
	return id;
}

public void setId(Integer id)
{
	this.id=id;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public Employee()
{
	super();
}
public Employee(Integer id,String name)
{
	this.id=id;
	this.name=name;
}
@Override
public String toString()
{
	return "Employee[id="+id+", name="+name+"]";
}
}
