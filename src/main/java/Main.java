import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    static School school = new School();
    public static void main(String[] args) {

      School mySchool = new School();
      Student student1 = new Student("Maija", "Gutāne");
      Student student2 = new Student("Uldis", "Vaicis");
      Teacher teacher = new Teacher( "Janis", "Ziedins");
        school.addStudent1(student1);
        school.addStudent1(student2);

                Main main = new Main();
                main.schoolMenu();
            }

            void schoolMenu() {

                String input = "";

                do {

                    System.out.println("School menu. Please choose an activity");
                    System.out.println("1. Add student");
                    System.out.println("2. Remove student");
                    System.out.println("3. Find student");
                    System.out.println("4. Edit student");

                    System.out.println("5. Add teacher");
                    System.out.println("6. Remove teacher");
                    System.out.println("7. Find teacher");
                    System.out.println("8. Edit teacher");

                    System.out.println("9. Add course");
                    System.out.println("10. Remove course");
                    System.out.println("11. Find course");
                    System.out.println("12. Edit course");
                    System.out.println("13. Exam results");
                    System.out.println("14. Assign teacher to the course");
                    System.out.println("\nEnter Quit to finish...");

                    System.out.println("Choose a number:");
                    input = scanner.nextLine();

                    switch (input) {
                        case "Quit":
                            System.out.println("Quit menu");
                            break;
                        case "1":
                            school.addStudent();
                            break;
                        case "2":
                            school.removeStudent();
                            break;
                      case "3":
                            school.findStudent();
                            break;
                        case "4":
                            school.editStudent();
                            break;
                        case "5":
                            school.addTeacher();
                            break;
                        case "6":
                            school.removeTeacher();
                            break;
                        case "7":
                            school.findTeacher();
                            break;
                        case "8":
                            school.updateTheTeacher();
                            break;
                        case "9":
                            school.createCourse();
                            break;
                       case "10":
                            school.removeCourse();
                            break;
                        case "11":
                            school.findCourse();
                            break;
                       case "12":
                            school.editCourse();
                            break;
                        case "13":
                            school.createExam();
                            break;
                            case "14":
                            school. teacherToCourse();
                           break;
                        default:
                            break;
                    }

                } while (!input.equalsIgnoreCase("Quit"));

            }
        }

