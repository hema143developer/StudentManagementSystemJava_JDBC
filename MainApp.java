package Com.StudentMns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsToAdd = new ArrayList<>();

        System.out.print("How many students do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Major: ");
            String major = scanner.nextLine();

            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            studentsToAdd.add(new Student(id, firstName, lastName, major, gpa));
        }

        for (Student student : studentsToAdd) {
            dao.addStudent(student);
        }

        System.out.println("--- Student Details from Database ---");
        List<Student> list = dao.getAllStudents();
        for (Student s : list) {
            System.out.println(s);
        }

        scanner.close();
    }
}