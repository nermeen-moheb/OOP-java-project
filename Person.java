public abstract class  Person  implements print {
private String first_name;
private String last_name;
private String phone_number;
private String ID;
private int age;
private String nationality;
private String address;

 Person()
{
	 first_name="no name";
		last_name="no name";
	    phone_number="0";
		ID="0";
	    age=0;
		nationality="Egyptian";
		address="";
}


 Person(String first_name, String last_name, String phone_number, String iD, int age, String nationality,
		String address) {
	
	this.first_name = first_name;
	this.last_name = last_name;
	this.phone_number = phone_number;
	this.ID = iD;
	this.age = age;
	this.nationality = nationality;
	this.address = address;
}


public String getFirst_name() {
	return first_name;
}


public void setFirst_name(String fn) {
	this.first_name = fn;
}


public String getLast_name() {
	return last_name;
}


public void setLast_name(String ln) {
	this.last_name = ln;
}


public String getPhone_number() {
	return phone_number;
}


public void setPhone_number(String num) {
	this.phone_number = num;
}


public String getID() {
	return ID;
}


public void setID(String id) {
	ID = id;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	if(age > 17 && age <100)
	this.age = age;
	else 
		System.out.println("Invalid");
}


public String getNationality() {
	return nationality;
}


public void setNationality(String nat) {
	this.nationality = nat;
}


public String getAddress() {
	return address;
}


public void setAddress(String ad) {
	this.address = ad;
}

public String toString() {
	
	return (" Name: " + this.first_name + " " + this.last_name  
			+ "\nPhone number: " + this.phone_number 
			+ "\nID: " + this.ID
			+ "\nAdress:" + this.address
			+ "\nAge : " + this.age
			+ "\nNationality " + this.nationality);
}
}