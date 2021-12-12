import java.util.ArrayList;

public class Student {
    public String studentName;
    public String studentSurname;


    public Student(String studentName, String studentSurname) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public String toString () {
        return " {name: " + studentName + ", surname: " + studentSurname + " }";
    }


}


