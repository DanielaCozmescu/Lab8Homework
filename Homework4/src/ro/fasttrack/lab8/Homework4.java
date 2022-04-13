package ro.fasttrack.lab8;

public class Homework4 {

    public static void main(String[] args) {
        Student student1 = new Student("Ana", 9);
        Student student2 = new Student("Petre", 5.7);
        Student student3 = new Student("Vasile", 7);
        Student student4 = new Student("Elena", 8.5);
        Student student5 = new Student("Andrei", 10);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
        printStudent(student4);
        printStudent(student5);

        System.out.println(student1.toString());
    }

    public static void printStudent(Student student) {
        System.out.println(student.getName() + " grade is " + student.getGrade());
    }

}
