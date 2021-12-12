public class Teacher {
    public String teachersName;
    public String teachersSurname;


    public Teacher(String teachersName, String teachersSurname) {
        this.teachersName = teachersName;
        this.teachersSurname = teachersSurname;
    }
    public String toString () {
        return " {name: " + teachersName + ", surname: " + teachersSurname + " }";
    }
}
