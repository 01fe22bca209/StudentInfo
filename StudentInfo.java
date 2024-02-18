/**
 * The Java program defines classes for Student and Course information, allowing for the creation of
 * students with associated courses and the identification of failed courses based on marks.
 */
import java.util.ArrayList;
import java.util.List;

/**
 * The class `StudentInfo` creates a student object with courses and displays student information
 * including failed courses.
 */
public class StudentInfo{
    public static void main(String[] args) {
        
        Course physics = new Course("Physics", 75);
        Course math = new Course("Math", 35);
        Course chemistry = new Course("Chemistry", 40);

        
        Student john = new Student("John Doe", "Bachelor", "Science");

        
        john.addCourse(physics);
        john.addCourse(math);
        john.addCourse(chemistry);

        
        System.out.println("Student Info:");
        System.out.println("Name: " + john.getStud_Name());
        System.out.println("Program: " + john.getProgram());
        System.out.println("Department: " + john.getDepartment());
        System.out.println("Courses: " + john.getCourses());

        
        System.out.println("\nFailed Courses:");
        System.out.println(john.getFailedCourses());
    }
}

/**
 * The Course class represents a course with a name and marks.
 */
class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }
}

/**
 * The `Student` class represents a student with attributes such as name, program, department, and a
 * list of courses, along with methods to add courses, retrieve student information, get course names,
 * and get failed courses.
 */
class Student {
    private String Stud_name;
    private String program;
    private String department;
    private List<Course> courses;

    public Student(String name, String program, String department) {
        this.Stud_name = name;
        this.program = program;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getStud_Name() {
        return Stud_name;
    }

    public String getProgram() {
        return program;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getCourses() {
        List<String> courseNames = new ArrayList<>();
        for (Course course : courses) {
            courseNames.add(course.getCourseName());
        }
        return courseNames;
    }

    public List<String> getFailedCourses() {
        List<String> failedCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                failedCourses.add(course.getCourseName()+ ": " + course.getMarks());
            }
        }
        return failedCourses;
        
    }
}

