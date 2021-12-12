public class Exam {

    public String examName;
    public int examScore;
    public Student student;
    public Course course;
//should be able to enter exam result specifying student, course and score
    public Exam(Student student, Course course, String examName, int examGrade) {
        this.examName = examName;
        this.examScore = examGrade;
        this.student = student;
        this.course = course;
    }
}
