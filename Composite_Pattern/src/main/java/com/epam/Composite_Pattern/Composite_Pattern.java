package com.epam.Composite_Pattern;

public class Composite_Pattern {

	public static void main(String[] args) {
		Employee CEO = new Employee("Rohith","CEO",892000);

		Employee HR = new Employee("Rajesh","Human Resource", 100000);
		Employee Marketing_Director = new Employee("Ramesh","Marketing Director",80000);

		Employee Production_Manager = new Employee("Rakesh","Product Manager",50000);
		Employee Training_and_development_officer = new Employee("Akash","Training and development officer", 50000);

		Employee Production_Staff = new Employee("Rajasekhar","Prduction_Staff", 10000);
		Employee Store_Manager= new Employee("Raja","Store_Manager", 10000);

		CEO.add(HR);
		CEO.add(Marketing_Director);

		HR.add(Training_and_development_officer);
		Marketing_Director.add(Production_Manager);

		Production_Manager.add(Production_Staff);
		Production_Manager.add(Store_Manager);
		System.out.println(CEO); 
		for (Employee headEmployee : CEO.getAssociates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getAssociates()) {
				System.out.println(employee);
			}
		}	
	}

}
