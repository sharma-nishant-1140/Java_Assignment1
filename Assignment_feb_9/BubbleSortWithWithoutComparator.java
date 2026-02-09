import java.util.*;
public class BubbleSortWithWithoutComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 85, 90, 78);
        Student s2 = new Student("Bob", 85, 85, 85);
        Student s3 = new Student("Charlie", 85, 90, 80);
        Student s4 = new Student("David", 80, 92, 90);
        Student s5 = new Student("Pope", 85, 92, 80);
        Student[] stdArr = {s1, s2, s3, s4, s5};

        for(int i = 0; i < stdArr.length - 1; i++) {
            for(int j = 0; j < stdArr.length - i - 1; j++) {
                if(stdArr[j].fsd > stdArr[j + 1].fsd) {
                    Student temp = stdArr[j];
                    stdArr[j] = stdArr[j + 1];
                    stdArr[j + 1] = temp;
                } else if(stdArr[j].fsd == stdArr[j + 1].fsd) {
                    if(stdArr[j].java > stdArr[j + 1].java) {
                        Student temp = stdArr[j];
                        stdArr[j] = stdArr[j + 1];
                        stdArr[j + 1] = temp;
                    } else if(stdArr[j].java == stdArr[j + 1].java) {
                        if(stdArr[j].cpp > stdArr[j + 1].cpp) {
                            Student temp = stdArr[j];
                            stdArr[j] = stdArr[j + 1];
                            stdArr[j + 1] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Students sorted by marks: \n" + Arrays.toString(stdArr));
    }
}
class Student {
    String name;
    int fsd;
    int java;
    int cpp;
    Student(String name, int fsd, int java, int cpp) {
        this.name = name;
        this.fsd = fsd;
        this.java = java;
        this.cpp = cpp;
    }
    public String toString() {
        return name + " : FSD = " + fsd + ", Java = " + java + ", C++ = " + cpp + "\n";
    }
}