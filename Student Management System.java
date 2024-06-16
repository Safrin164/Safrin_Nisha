import java.util.ArrayList;
import java.util.Scanner;
                                
class Student 
{
    private int id;
    private String name;
    private int age;
    private String grade;
                                
    public Student(int id, String name, int age, String grade) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
                                
    public int getId() 
    {
        return id;
    }
                                
    public String getName() 
    {
        return name;
    }
                                
    public int getAge() 
    {
        return age;
    }
                                
    public String getGrade() 
    {
        return grade;
    }
                                
    @Override
    public String toString() 
    {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
                                
public class StudentManagementSystem 
{
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
                                
    public static void main(String[] args) 
    {
        while (true) 
        {
            displayMenu();
            handleUserInput();
        }
    }
                                
    private static void displayMenu() 
    {
        System.out.println("\nStudent Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");                                
    }
                                
    private static void handleUserInput()
    {
        int choice = scanner.nextInt();
        scanner.nextLine(); 
                                
        switch (choice) {
        case 1:
        addStudent();
        break;
        case 2:
        viewStudents();
        break;
        case 3:
        searchStudent();
        break;
        case 4:
        deleteStudent();
        break;
        case 5:
        System.out.println("Exiting...,Thankyou!");
        System.exit(0);
        break;
        default:
        System.out.println("Invalid option. Please try again.");
    }
}
                                
private static void addStudent() 
{
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();
    System.out.print("Enter student age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); 
    System.out.print("Enter student grade: ");
    String grade = scanner.nextLine();
                                
    int id = students.size() + 1;
    Student student = new Student(id, name, age, grade);
    students.add(student);
    System.out.println("Student added: " + student);
}
                                
private static void viewStudents() 
{
    for (Student student : students) 
    {
        System.out.println(student);
    }
}
                                
private static void searchStudent() 
{
    System.out.print("Enter student name to search: ");
    String query = scanner.nextLine();
    for (Student student : students) 
    {
        if (student.getName().toLowerCase().contains(query.toLowerCase())) 
        {
            System.out.println(student);
        }
    }
}
                                
private static void deleteStudent() 
{
    System.out.print("Enter student ID to delete: ");
    int id = scanner.nextInt();
    scanner.nextLine(); 
                                
    students.removeIf(student -> student.getId() == id);
    System.out.println("Student deleted.");
}
}