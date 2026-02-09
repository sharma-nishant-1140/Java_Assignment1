import java.util.*;
public class BubbleSortWithComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", new int[]{85, 90, 78});
        Student s2 = new Student("Bob", new int[]{85, 85, 85});
        Student s3 = new Student("Charlie", new int[]{85, 90, 80});
        Student s4 = new Student("David", new int[]{80, 92, 90});
        Student s5 = new Student("Pope", new int[]{85, 92, 80});
        Student[] stdArr = {s1, s2, s3, s4, s5};

        Arrays.sort(stdArr, Comparator.comparing((Student s) -> s.marks[0]).thenComparing(s -> s.marks[1]).thenComparing(s -> s.marks[2]));
        System.out.println("Students sorted by marks: \n" + Arrays.toString(stdArr));
    }
}
class Student {
    String name;
    int[] marks;
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return name + " :  = " + Arrays.toString(marks) + "\n";
    }
    

}