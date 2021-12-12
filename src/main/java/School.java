import javax.swing.*;
import java.util.ArrayList;

public class School {

    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList <Teacher> teachers = new ArrayList<>();
    public ArrayList <Course> courses = new ArrayList<>();
    public ArrayList <Exam> exams = new ArrayList<>();


    public Student addStudent1(Student student) {
        students.add(student);
        return student;
    }

    public Student addStudent(){
        String studentName = JOptionPane.showInputDialog("Enter students name!");
        String studentSurname = JOptionPane.showInputDialog("Enter students Surname!");
        Student student = new Student(studentName,studentSurname);
        students.add(student);
        System.out.println("Student " + student + " added to the students list.");
        return student;
    }

    public String removeStudent(){
        Student student = findStudent();
        if ( student == null) {
            System.out.println("Student not found!");}
        else {students.remove(student);
        System.out.println("Student " + student + " removed from the students list");}
        return student + " removed!";
    }

    public Student findStudent(){
        String studentName = JOptionPane.showInputDialog("Enter students name!");
        String studentSurname = JOptionPane.showInputDialog("Enter students Surname!");
        for (Student student1: students){
            if(student1.studentName.equals(studentName) & student1.studentSurname.equals(studentSurname)) {
                System.out.println(student1 + " - Student found!");
                return student1;
            }
        } return null;
    }

    public Student editStudent (){
        Student studentToEdit = findStudent();
        if (studentToEdit == null) {
            System.out.println("Student not found!");
        } else {
            int indx = students.indexOf(studentToEdit);
            String studentName = JOptionPane.showInputDialog("Enter students new name!");
            String studentSurname = JOptionPane.showInputDialog("Enter students new surname!");
            studentToEdit.studentName = studentName;
            studentToEdit.studentSurname = studentSurname;
            students.set(indx, studentToEdit);
            System.out.println("Student edited successfully. New student:  " + studentToEdit);
            return studentToEdit;
        }return  null;
    }

    public Teacher addTeacher(){
        String teachersName = JOptionPane.showInputDialog("Enter teachers name!");
        String teachersSurname = JOptionPane.showInputDialog("Enter teachers surname!");
        Teacher teacher = new Teacher(teachersName, teachersSurname);
        teachers.add(teacher);
        System.out.println("Teacher added to the teachers list: " + teacher);
        return teacher;
    }

    public String removeTeacher() {
       Teacher teacher = findTeacher();
       if(teacher == null) {
           System.out.println("Teacher not found");
       } else {
        teachers.remove(teacher);
        System.out.println("Teacher removed from the teachers list");}
        return "Teacher removed from the teachers list";
    }

    public Teacher findTeacher() {
        String teachersName = JOptionPane.showInputDialog("Enter teachers name!");
        String teachersSurname = JOptionPane.showInputDialog("Enter teachers surname!");
        for (Teacher teacher1: teachers){
            if(teacher1.teachersName.equals(teachersName) & teacher1.teachersSurname.equals(teachersSurname)) {
                return teacher1;
            }
        }return null;
    }

    public Teacher updateTheTeacher() {
        Teacher teacherToEdit = findTeacher();
        int indx = teachers.indexOf(teacherToEdit);
        String teachersName = JOptionPane.showInputDialog("Enter new teachers name!");
        String teachersSurname = JOptionPane.showInputDialog("Enter new teachers surname!");
        teacherToEdit.teachersName = teachersName;
        teacherToEdit.teachersSurname = teachersSurname;
        teachers.set(indx, teacherToEdit);
        System.out.println("Teacher edited successfully. New Teachers name and surname: " + teacherToEdit);
        return teacherToEdit;
    }

    public Course createCourse(){
        String courseName = JOptionPane.showInputDialog("Enter new course name!");
        int courseLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the course length(full weeks)!"));
        Course course = new Course(courseName, courseLength);
        courses.add(course);
        System.out.println( course + " - Course created successfully.");
        return course;
    }

    public Course findCourse () {
        String courseName = JOptionPane.showInputDialog("Enter new course name!");
        int courseLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the course length(full weeks)!"));
        for (Course course1: courses) {
            if(course1.courseName.equals(courseName)){
                System.out.println(course1 + " - Course found.'");
                return course1;
            }
        }return null;
    }

    public String removeCourse () {
        Course course = findCourse();
        if (course == null) {
            System.out.println("Course not found");
        }else {
            courses.remove(course);
            System.out.println(course + " - Course removed from courses list.");
            return "Course removed from courses list.";
        }return null;
    }

    public String editCourse () {
        Course courseToEdit = findCourse();
        int indx = courses.indexOf(courseToEdit);
        String courseName = JOptionPane.showInputDialog("Enter new course name!");
        int courseLength = Integer.parseInt(JOptionPane.showInputDialog("Enter new course length(full weeks)!"));
        courseToEdit.courseName =courseName;
        courseToEdit.courseLength = courseLength;
        courses.set(indx,courseToEdit);
        System.out.println("Course edited successfully. New course: " + courses);
        return " Course edited successfully ";
    }

    public String createExam () {
        String examName = JOptionPane.showInputDialog("Enter new exam name!");
        int examGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter exams grade (1 till 10)!"));
        Exam exam = new Exam(findStudent(),findCourse(),examName,examGrade);
        exams.add(exam);
        System.out.println("Exam grade: " + examGrade);
        return "Exam added successfully.";
    }
   public String teacherToCourse(){
        Course course = findCourse();
       int indx = courses.indexOf(course);
       Teacher teacher = findTeacher();
       course.setTeacher(teacher);
       courses.set(indx,course);
       System.out.println("teacher - " + teacher + " - assigned to the course - " + course);
        return "T";
    }

}
