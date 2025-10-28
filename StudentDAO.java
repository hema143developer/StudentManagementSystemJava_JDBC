package Com.StudentMns;

	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;

	public class StudentDAO {

	    // CREATE operation
	    public void addStudent(Student student) {
	        String sql = "INSERT INTO students (first_name, last_name, major, gpa) VALUES (?, ?, ?, ?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            pstmt.setString(1, student.getFirstName());
	            pstmt.setString(2, student.getFirstName());
	            pstmt.setString(3, student.getMajor());
	            pstmt.setDouble(4, student.getGpa());
	            pstmt.executeUpdate();
	            System.out.println("Student added successfully!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // READ operation (Retrieve all students)
	    public List<Student> getAllStudents() {
	        List<Student> students = new ArrayList<>();
	        String sql = "SELECT * FROM students";
	        try (Connection conn = DBConnection.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            while (rs.next()) {
	                Student student = new Student(
	                    rs.getInt("student_id"),
	                    rs.getString("first_name"),
	                    rs.getString("last_name"),
	                    rs.getString("major"),
	                    rs.getDouble("gpa")
	                );
	                students.add(student);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return students;
	    }

	    // Additional methods for Update (UPDATE) and Delete (DELETE) would be similar.
	}
	

