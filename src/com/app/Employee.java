package com.app;

public class Employee {
	private int  empId;
	
    private String empCost;
    
    private String empLocation;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpCost() {
		return empCost;
	}

	public void setEmpCost(String empCost) {
		this.empCost = empCost;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empCost=" + empCost + ", empLocation=" + empLocation + "]";
	}
    
    
    
	

}
