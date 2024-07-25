package com.tnsif.daythree;

public class Employee {

	public String name;
	private int id;
	public String jobdescribtion;
	
	public Employee() {
		System.out.println("default constructor");	
		}

	public Employee(String name, int id, String jobdescribtion) {
		super();
		System.out.println("parameterized constructor");
		this.name = name;
		this.id = id;
		this.jobdescribtion = jobdescribtion;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the jobdescribtion
	 */
	public String getJobdescribtion() {
		return jobdescribtion;
	}

	/**
	 * @param jobdescribtion the jobdescribtion to set
	 */
	public void setJobdescribtion(String jobdescribtion) {
		this.jobdescribtion = jobdescribtion;
	}

	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", jobdescribtion=" + jobdescribtion + "]";
	}
	
	
}
