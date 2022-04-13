package ro.fasttrack.lab8;

public class Student {
    private String name;
    private double grade;
    private static double sum;
    private static int numStudents;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        sum += grade;
        numStudents = numStudents +1;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static double getSum() {
        return sum;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public String toString(){
        return "The average grade for the " + numStudents + " sudents is " + (sum/numStudents);
    }
}
