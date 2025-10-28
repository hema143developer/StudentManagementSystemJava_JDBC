package Com.StudentMns;

public class Student {

	    private int id;
	    private String firstName;
	    private String lastName;
	    private String major;
	    private double gpa;

	    // Constructor
	    public Student(int id, String firstName, String lastName, String major, double gpa) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.major = major;
	        this.gpa = gpa;
	    }
	    
	    public static void main(String[] args) {
	    	Student s1 = new Student(1, "Hema", "Kumari", "Computer Science", 9.2);
	    	System.out.println(s1);
	    }

	    // Getters and Setters (Omitted for brevity)

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Major: " + major + ", GPA: " + gpa;
	    }

		public String getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getMajor() {
			// TODO Auto-generated method stub
			return null;
		}

		public double getGpa() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	

