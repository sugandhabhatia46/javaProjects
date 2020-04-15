package com.in28minutes.Oops.level2.inheritence;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("Sugandha", 123456789, "xyz@gmail.com");
		employee.setEmployeeGrade("abcd");

		System.out.println(employee);

	}

}
