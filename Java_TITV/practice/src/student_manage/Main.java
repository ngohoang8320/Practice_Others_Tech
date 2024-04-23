package student_manage;

public class Main {
    public static void main(String[] args) {
        Birth birth1 = new Birth(15, 1, 2002);
        Birth birth2 = new Birth(17, 2, 2001);
        Birth birth3 = new Birth(15, 7, 2002);

        ClassAndField classAndField1 = new ClassAndField("DH101", "Information Technology");
        ClassAndField classAndField2 = new ClassAndField("DH102", "Marketing");
        ClassAndField classAndField3 = new ClassAndField("DH103", "Economic");

        Student student1 = new Student(1, "Toi La A", birth1, 9.0, classAndField1);
        Student student2 = new Student(2, "Toi La B", birth2, 4.0, classAndField2);
        Student student3 = new Student(3, "Toi La C", birth3, 6.0, classAndField3);

        System.out.printf("%-15s%-25s%-15s\n", "Name: ", "Field: ", "State: ");
        System.out.printf("%-15s%-25s%-15s\n", student1.getName(), student1.getField(), student1.isPass());
        System.out.printf("%-15s%-25s%-15s\n", student2.getName(), student2.getField(), student2.isPass());
        System.out.printf("%-15s%-25s%-15s\n", student3.getName(), student3.getField(), student3.isPass());

        System.out.println();
        System.out.println();

        System.out.println("Student 1 " + (student1.isSameBirthDate(student3)
                ? "have the same"
                : "don't have the same") + " date of birth with Student 3");
    }
}
