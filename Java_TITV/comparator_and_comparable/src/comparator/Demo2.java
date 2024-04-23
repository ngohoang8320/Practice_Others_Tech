package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age,
                   String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
}

public class Demo2 {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1,
                               Student o2) {
                return o1.age > o2.age
                        ? 1
                        : -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Paul"));
        studs.add(new Student(20, "Kiran"));
        for (Student s : studs) {
            System.out.println(s);
        }

        Collections.sort(studs, com);

        System.out.println();
        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
