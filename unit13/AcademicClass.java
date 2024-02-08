import java.util.ArrayList;

public class AcademicClass{
    private Teacher teacher;
    private ArrayList<Student> students;

    public AcademicClass(Teacher teacher) {
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printClassInfo() {
        System.out.println("Teacher: " + teacher.getName() + ", Subject: " + teacher.getSubject());
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public ArrayList<String> getStudentFavoriteNumber(int n) {
        ArrayList<String> studentFavoriteNumber = new ArrayList<>();
        for (Student student : students) {
            if (student.getFavoriteNumber() == n) {
                studentFavoriteNumber.add(student.getName());
            }
        }
        return studentFavoriteNumber;
    }

    public ArrayList<String> getOddFavoriteNumber() {
        ArrayList<String> studentOddFavoriteNumber = new ArrayList<>();
        for (Student student : students) {
            if (student.getFavoriteNumber() % 2 != 0) {
                studentOddFavoriteNumber.add(student.getName());
            }
        }
        return studentOddFavoriteNumber;
    }
    
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dr. Kessner", "Computer Science");

        Student student1 = new Student("Wynter", 7);
        Student student2 = new Student("Nina", 5);
        Student student3 = new Student("Mia", 8);

        AcademicClass compSci = new AcademicClass(teacher);
        compSci.addStudent(student1);
        compSci.addStudent(student2);
        compSci.addStudent(student3);

        System.out.println("Class Information:");
        compSci.printClassInfo();

        System.out.println("Students with favorite number 7:");
        ArrayList<String> studentsWithFavoriteNumber7 = compSci.getStudentFavoriteNumber(7);
        for (String student : studentsWithFavoriteNumber7) {
            System.out.println(student);
        }

        System.out.println("Students with odd favorite number:");
        ArrayList<String> studentsWithOddFavoriteNumber = compSci.getOddFavoriteNumber();
        for (String student : studentsWithOddFavoriteNumber) {
            System.out.println(student);
        }
    }
}