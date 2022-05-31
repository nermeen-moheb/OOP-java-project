import java.util.Scanner;
enum level{ first_level, second_level, third_level, forth_level};
public class Student extends Person implements print, gpa {
	
	 protected double gpa;
	 private String email ;
	 private int Level;
	 Scanner input = new Scanner(System.in);
 Student() {
	    super();
	    gpa = 4;
	    email= "gmail";
	    Level= 0;

	}
 Student(String first_name, String last_name, String phone_number, String iD, int age, String nationality,
			String address, double gpa, String email, int Level){
	 
	 super(first_name, last_name,phone_number,iD,age,nationality, address);
	 this.gpa=gpa;
	 this.email=email;
	 this.Level=Level;
	 
 }

	    public void setGpa(double gpa) {
	    
		    
	    	 if(gpa<=4 && gpa>=0)
			    {
			    	this.gpa=gpa;}
		    	 else {
		    	boolean  flag = false;
		    	while(flag == false) 
		    	{
		    		System.out.println("Enter a number between 0 and 4");
			        gpa=input.nextDouble();
			        if(gpa<4 && gpa>0)
				    {
				    	this.gpa=gpa;
				    	flag = true;
				    }
		    	}
		    }}
		  
	    	 
	  
	    

	    public void setEmail(String email) {
	        this.email = email;
	    }

	   

	    public void setLevel(int Level) {
	        this.Level = Level;
	    }

	    public double getGpa() {
	        return gpa;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public int getLevel() {
	        return Level;
	    }

	 
	public String toString() {
	
	return (super.toString() +
			"\nGPA: " + this.gpa +
			"\nEmail: " + this.email
			+ "\nLevel: " + this.Level); 
		
	}
	 public String gpasystem()
	 {
		
		 if (getGpa()>=3.5)
		 System.out.println("your grade is Excellent");
		 else if (getGpa()>=2.7 &&  getGpa()<3.5)
		 System.out.println("your grade is Good");
		 else if (getGpa()>=2.0 &&  getGpa()<2.7)
			 System.out.println("you passed, but you should study harder");
		 else if (getGpa()>=1.5 && getGpa()<2)
			 System.out.println("very poor, you should study harder");
		 else 
			 System.out.println("you didn't pass");
		 
		return "with the best wishes";
	 }
	
	

	
	
	
	
}