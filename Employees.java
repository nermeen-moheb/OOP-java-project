public abstract class Employees extends Person implements print {
private double salary;
private String position;

Employees(){
	super();
	this.salary= 0;
	this.position="no position";
}

Employees(String first_name, String last_name, String phone_number, String iD, int age, String nationality,
		String address, double salary, String position){
	super(first_name, last_name,phone_number,iD,age,nationality, address);
	this.salary = salary;
	this.position=position;
}

public void setSalary(double salary){
	this.salary=salary;
}

public void setPosition(String position){
	this.position= position;
}

public double getSalary() {
	return this.salary;
}

public String getPosition() {
	return this.position;
}
 
public String toString() {
	return (super.toString() + "\nSalary: " + this.salary + "\nPosition: " + this.position); 
}
}