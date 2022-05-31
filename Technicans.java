public class Technicans extends Employees implements print{
private String speciality;

Technicans(){
	super();
	this.speciality="no speciality";
}

Technicans(String first_name, String last_name, String phone_number, String iD, int age, String nationality,
		String address, double salary, String position, String speciality){
	super(first_name, last_name,phone_number,iD,age,nationality, address, salary, position);
	this.speciality=speciality;
}

public void setSpeciality(String speciality) {
	this.speciality = speciality;
} 
public String getSpeciality() {
	return this.speciality;
} 
public String toString() {
	return (super.toString() + "\nSpeciality: " + this.speciality); 
}

}