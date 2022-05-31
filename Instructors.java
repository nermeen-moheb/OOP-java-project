public class Instructors extends Employees implements print {
private String courseName;

Instructors(){
	super();
	this.courseName="no course";
}

Instructors(String first_name, String last_name, String phone_number, String iD, int age, String nationality,
		String address, double salary, String position, String courseName){
	
	super(first_name, last_name,phone_number,iD,age,nationality, address, salary, position);
	this.courseName=courseName;

}
public void setCourseName(String courseName) {
	this.courseName = courseName;
} 

public String getCourseName() {
	return this.courseName;
} 

public String toString() {
	return (super.toString() + "\nCourse Name: " + this.courseName); 
}



}