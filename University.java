import java.util.ArrayList;
import java.util.Scanner;
public class University {
	 static  ArrayList <Student> saveStudent  = new ArrayList<>();

	    public static void addStudent(){
	    	try {
	        Scanner input = new Scanner(System.in);
	        Student std1= new Student();
	        System.out.println(" Please enter Student's First Name: ");
	        std1.setFirst_name(input.next());
	        System.out.println(" Please enter Student's Last Name: ");
	        std1.setLast_name(input.next());
	        System.out.println(" Please enter Student's ID: ");
	        std1.setID(input.next());
	        System.out.println(" Please enter Student's email: ");
	        std1.setEmail(input.next());
	        System.out.println(" Please enter Student's gpa: ");
	        std1.setGpa(input.nextDouble());
	       
	        System.out.println(" Please enter Student's age: ");
	        std1.setAge(input.nextInt());
	        System.out.println(" Please enter Phone Number: ");
	        std1.setPhone_number(input.next());
	        System.out.println(" Please enter Student's Nationality: ");
	        std1.setNationality(input.next());
	        System.out.println(" Please enter Student's Level: ");
	        std1.setLevel(input.nextInt());
	        System.out.println(" Please enter Student's Address : ");
	        std1.setAddress(input.next());
	        

	        saveStudent.add(std1);
	        
	       
	    }
	    	catch(Exception addstudent) {
	    	}
	    	}
	    
	    public static void showStudents(){
	        
	            for(int i = 0;i < saveStudent.size(); i++){
	                Student Student = saveStudent.get(i);
	                System.out.println(Student.toString());
	                System.out.println(Student.gpasystem());
	               
	            
	            
	        }
	        
	    }


	    public static void removeStudent(){
	        try {
	            Scanner input = new Scanner(System.in);
	            System.out.print("\n\t Enter student ID you want to remove: ");
	            String studentID = input.next();
	            for (int i = 0; i < saveStudent.size(); i++) {
	                Student studentTobeRemoved = saveStudent.get(i);
	                if (studentTobeRemoved.getID().equals(studentID)) {
	                    saveStudent.remove(studentTobeRemoved);
	                    System.out.println("Removal was successful");
	                    break;
	                }
	            }
	        }
	        catch (Exception RemoveStudent){

	        }
	    }
	    public static void SearchStudent(){
	        try {
	            Scanner input = new Scanner(System.in);
	            Student st=new Student();
	            System.out.print("\n\t Enter student ID to get his/her information ");
	            String studentID = input.next();
	            for (int i = 0; i < saveStudent.size(); i++) {
	                Student Searched = saveStudent.get(i);
	                if (Searched.getID().equals(studentID)) {
	                    
	                    System.out.println(Searched.toString());
	                    break;
	                    
	                }
	                
	            }
	        }
	        catch (Exception SearchStudent){

	        }
	    }

	static ArrayList <Adminstrators>saveAdmins = new ArrayList<>();
	
	public static void addAdmin() {
		
		Scanner input = new Scanner(System.in);
		Adminstrators Admin1 = new  Adminstrators();
		System.out.println("Please enter the first name");
		Admin1.setFirst_name(input.next());
		 System.out.println("Please enter the Last name");
	        Admin1.setLast_name(input.next());
	        System.out.println("Please enter the ID");
	        Admin1.setID(input.next());
	        System.out.println("Please enter Phone number");
	        Admin1.setPhone_number(input.next());
	        System.out.println("Please enter Age");
	        Admin1.setAge(input.nextInt());
	        System.out.println("Please enter Nationality");
	        Admin1.setNationality(input.next());
	        System.out.println("Please enter Adress");
	        Admin1.setAddress(input.next());
	        System.out.println("Please enter Department");
	        Admin1.setDepartment(input.next());
	        System.out.println("Please enter Salary");
	        Admin1.setSalary(input.nextDouble());
	        System.out.println("Please enter Position");
	        Admin1.setPosition(input.next());
	        saveAdmins.add(Admin1);
	        
	    }
	
	

	public static void showAdmin() {
		
			for(int i =0; i<saveAdmins.size(); i++)
			{
				Adminstrators Adminshow = saveAdmins.get(i);
				System.out.println(Adminshow.toString());
			}
		
		
	}
	
	public static void removeAdmin() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the ID of the admin you want to remove");
			String AdminID = input.next();
			for (int i= 0; i<saveAdmins.size();i++)
			{
				Adminstrators AdminRemove = saveAdmins.get(i);
				if (AdminRemove.getID().equals(AdminID))
						{
					saveAdmins.remove(AdminRemove);
					System.out.println("Removal was Successful");
					break;
						}
			}
					
		}
		catch(Exception removeAdmin) {
			
		}
	}
	public static void SearchAdmin(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("\n\t Enter Admin ID to get his/her information ");
            String AdminID = input.next();
            for (int i = 0; i < saveAdmins.size(); i++) {
                Adminstrators Searched = saveAdmins.get(i);
                if (Searched.getID().equals(AdminID)) {
                    
                    System.out.println(Searched.toString());
                    break;
                }
            }
        }
        catch (Exception SearchAdmin){

        }
    }
		static ArrayList <Technicans>saveTechnicans=new ArrayList<>();
		public static void addTechnican(){
		    Scanner input = new Scanner(System.in);
		    Technicans t = new Technicans();
		    System.out.println(" Please enter Technican's first Name: ");
		    t.setFirst_name(input.next());
		    System.out.println(" Please enter Technican's last Name: ");
		    t.setLast_name(input.next());
		    System.out.println(" Please enter Technican's address: ");
		    t.setAddress(input.next());
		    System.out.print(" Please enter Technican's ID: ");
		    t.setID(input.next());
		    System.out.println("Please enter Phone number");
	        t.setPhone_number(input.next());
		    System.out.println(" Please enter Technican's age: ");
		    t.setAge(input.nextInt());
		    System.out.println(" Please enter Technican's nationality: ");
		    t.setNationality(input.next());
		    System.out.println(" Please enter Technican's speciality: ");
		    t.setSpeciality(input.next());
		    System.out.println(" Please enter Technican's Position ");
	        t.setPosition(input.next());
	        System.out.println(" Please enter Technican's salary");
	        t.setSalary(input.nextDouble());
	        
		    saveTechnicans.add(t);
		    
		    
		}

		public static void showTechnicans(){
		    
		        for(int i = 0;i < saveTechnicans.size(); i++){
		        	Technicans showtechnicans = saveTechnicans.get(i);
		            System.out.println(showtechnicans.toString());
		        
		    }
		   
		}

		
		public static void removeTechnicans(){
		    try {
		        Scanner input = new Scanner(System.in);
		        System.out.println(" Enter technican ID you want to remove: ");
		        String technicanID = input.nextLine();
		        for (int i = 0; i < saveTechnicans.size(); i++) {
		        	Technicans TechRemove = saveTechnicans.get(i);
		            if (TechRemove.getID().equals(technicanID)) {
		                saveTechnicans.remove(TechRemove);
		                System.out.println("Removal was Successful");
		                break;
		            }
		        }
		    }
		    catch (Exception Removetechnicans){

		    }
		}
		public static void SearchTechnicans(){
	        try {
	            Scanner input = new Scanner(System.in);
	            System.out.print("\n\t Enter Technican ID to get his/her information ");
	            String TechnicanID = input.next();
	            for (int i = 0; i < saveTechnicans.size(); i++) {
	                Technicans Searched = saveTechnicans.get(i);
	                if (Searched.getID().equals(TechnicanID)) {
	                    
	                    System.out.println(Searched.toString());
	                    break;
	                }
	            }
	        }
	        catch (Exception SearchTechnicans){

	        }
	    }

		 static  ArrayList <Instructors> saveInstructors  = new ArrayList<>();

		    public static void addInstructor(){
		        Scanner input = new Scanner(System.in);
		        Instructors In = new Instructors();
		        System.out.println(" Please enter Instructor's First Name: ");
		        In.setFirst_name(input.next());
		        System.out.println(" Please enter Instructor's Last Name: ");
		        In.setLast_name(input.next());
		        System.out.println(" Please enter Instructor's Position ");
		        In.setPosition(input.next());
		        System.out.println(" Please enter Instructor's Course Name ");
		        In.setCourseName(input.next());
		        System.out.println(" Please enter Instructor's salary");
		        In.setSalary(input.nextDouble());
		        System.out.println(" Please enter Instructor's phone number ");
		        In.setPhone_number(input.next());
		        System.out.println(" Please enter Instructor's ID ");
		        In.setID(input.next());
		        System.out.println(" Please enter Instructor's age ");
		        In.setAge(input.nextInt());
		        System.out.println(" Please enter Instructor's nationality ");
		        In.setNationality(input.next());
		        System.out.println(" Please enter Instructor's address ");
		        In.setAddress(input.next());

		        saveInstructors.add(In);
		        
		    }
		    
		        public static void showInstructors(){
		           
		                for(int i = 0;i < saveInstructors.size(); i++){
		                    Instructors Ins = saveInstructors.get(i);
		                    System.out.println(Ins.toString());
		                
		            }
		            
		        }


		        public static void RemoveInstructors(){
		            try {
		                Scanner input = new Scanner(System.in);
		                System.out.println(" Enter Instructor ID you want to remove: ");
		                String InstructorID = input.nextLine();
		                for (int i = 0; i < saveInstructors.size(); i++) {
		                    Instructors instrucRemove = saveInstructors.get(i);
		                    if (instrucRemove.getID().equals(InstructorID)) {
		                        saveInstructors.remove(instrucRemove);
		                        System.out.println(" Instructor is removed ");
		                        break;
		                    }
		                }
		            }	    catch (Exception RemoveInstructors){

		            }
		        }
		        public static void SearchInstructors(){
		            try {
		                Scanner input = new Scanner(System.in);
		                System.out.print("\n\t Enter Instructor ID to get his/her information ");
		                String InstructorID = input.next();
		                for (int i = 0; i < saveInstructors.size(); i++) {
		                    Instructors Searched = saveInstructors.get(i);
		                    if (Searched.getID().equals(InstructorID)) {
		                        
		                        System.out.println(Searched.toString());
		                        break;
		                        
		                    }
		                }
		            }
		            catch (Exception SearchInstructors){

		            }
		        }
		
	
	public static void main(String[] args) {
		

		   Scanner input = new Scanner(System.in);

	        while (true){
	            System.out.println("\t Main Menu ");
	            System.out.println("\t 1-Student ");
	            System.out.println("\t 2-Instructor ");
	            System.out.println("\t 3-Technician ");
	            System.out.println("\t 4-Administrator ");
	            System.out.println("\t 5-Exit ");
	            System.out.println("\t Select your option (1-5) : ");
	            int num = input.nextInt();

	            if (num >= 1 && num <= 5) {
	                if (num == 1) {
	                    System.out.println("\t 1-Add Student");
	                    System.out.println("\t 2-Remove Student");
	                    System.out.println("\t 3-Show Student Details");
	                    System.out.println("\t 4-Search for Student by ID");
	                    System.out.println("\t Select your option (1-4) : ");
	                    
	                    
	                    int option = input.nextInt();

	                    if(option==1){
	                    	addStudent();
	                    	
	                    	
	                    }
	                    if(option==2){
	                        removeStudent();
	                    }
	                    if(option==3){
	                        showStudents();
	                    }
	                    if(option ==4)
	                    {
	                    	SearchStudent();
	                    }
	                    }
	                   
	                
	                else if (num == 2) {
	                    System.out.println("\t 1-Add Instructor");
	                    System.out.println("\t 2-Remove Instructor");
	                    System.out.println("\t 3-Show Instructor Details");
	                    System.out.println("\t 4-Search for Instructor by ID");
	                    System.out.println("\t Select your option (1-4) : ");
	                    int option = input.nextInt();

	                    if(option==1){
	                    	addInstructor();
	                    }
	                    if(option==2){
	                        RemoveInstructors();
	                    }
	                    if(option==3){
	                        showInstructors();
	                    }
	                    if(option==4){
	                       SearchInstructors();
	                    }
	                    }

	                
	                else  if (num == 3) {
	                    System.out.println("\t 1-Add Technician");
	                    System.out.println("\t 2-Remove Technician");
	                    System.out.println("\t 3-Show Technician Details");
	                    System.out.println("\t 4-Search for Technican by ID");
	                    System.out.println("\t Select your option (1-4) : ");
	                    int option = input.nextInt();

	                    if(option==1){
	                    	addTechnican();
	                    }
	                    if(option==2){
	                        removeTechnicans();
	                    }
	                    if(option==3){
	                        showTechnicans();
	                    }
	                    if(option ==4) {
	                    	SearchTechnicans();
	                    }
	                    
	                }
	                else if (num == 4) {
	                    System.out.println("\t 1-Add Administrator");
	                    System.out.println("\t 2-Remove Administrator");
	                    System.out.println("\t 3-Show Administrator Details");
	                    System.out.println("\t 4-Search for Adminstrator by ID");
	                    System.out.println("\t Select your option (1-4) : ");
	                    
	                    int option = input.nextInt();

	                    if(option==1){
	                    	addAdmin();
	                    }
	                    if(option==2){
	                        removeAdmin();
	                    }
	                    if(option==3){
	                    	showAdmin();
	                    }
	                    if(option==4){
	                    	SearchAdmin();
	                    }

	                }
	                else if (num == 5) {
	                	System.out.println("Thank you");
	                    break;
	                }
	            }
	        }
	    
	}}