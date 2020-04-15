package com.in28minutes.Oops.level2.inheritence;

public class Employee extends Person {

	public Employee(String name, int phone, String email) {
		super(name, phone, email);

	}

	private String title;
	private String employer;
	private String employeeGrade;
	private int Salary;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return String.format("name - %s phone - %d email - %s title - %s employer - %s employeeGrade -%s", name, phone,
				email, title, employer, employeeGrade);
	}

}
