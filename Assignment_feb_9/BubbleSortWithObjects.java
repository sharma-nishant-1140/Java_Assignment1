import java.util.*;

public class BubbleSortWithObjects {
    public static void main(String[] args) {
        Student s1= new Student("Alice", 85);
        Student s2 = new Student("Bob", 75);
        Student s3 = new Student("Charlie", 95);
        Student s4 = new Student("David", 80);
        Student s5 = new Student("Pope", 99);
        Student[] students = {s1, s2, s3, s4, s5};

        for(int i = 0; i < students.length - 1; i++) {
            for(int j = 0; j < students.length - i - 1; j++) {
                if(students[j].getMarks() > students[j + 1].getMarks()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Students sorted by marks: " + Arrays.toString(students));
    }
}

class Student {
    private String name;
    private int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {return name;}
    public int getMarks() {return marks;}
    public String toString() {
        return name + " : " + marks;
    }
}