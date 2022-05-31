public class Adminstrators extends Employees implements print {

    private  String department;
    
    Adminstrators(){
    	super();
    	this.department="no department";
    }
    
   Adminstrators(String first_name, String last_name, String phone_number, String iD, int age, String nationality,
    		String address, double salary, String position,String department){
    	
    super(first_name, last_name,phone_number,iD,age,nationality, address, salary, position);
    	this.department=department;
    }
   
    public void setDepartment(String department)
    {
    	this.department=department;
    	}
    public String getDepartment()
    {
    	return department;
    	}

    public String toString() {
    	return (super.toString() + "\nDepartment: " + this.department); 
    }
    
   
    
}