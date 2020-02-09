package org.emp;

public class Employee extends Loaction {

	public void empID() {
		System.out.println("emp id");
	}
	public void empName() {
		System.out.println("emp name");
	}
	public void empPhone() {
		System.out.println("emp phone");
	}
	private void empDob() {
System.out.println("emp dob");
	}
	private void empEmail() {
System.out.println("emp email");
	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empID();
		e.empName();
		e.empPhone();
		e.empDob();
		e.empEmail();
		e.locArea();
		e.cityArea();
	
	}
}

