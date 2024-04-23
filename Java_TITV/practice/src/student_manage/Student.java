package student_manage;

public class Student {
    private int id;
    private String name;
    private Birth birth;
    private double averageScore;
    private ClassAndField classAndField;

    public Student(int id,
                   String name,
                   Birth birth,
                   double averageScore,
                   ClassAndField classAndField) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.averageScore = averageScore;
        this.classAndField = classAndField;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return this.classAndField.getFieldName();
    }

    public String isPass() {
        return this.averageScore >= 5
                ? "Pass"
                : "Fail";
    }

    public boolean isSameBirthDate(Student other) {
        return this.birth.getDate() == other.birth.getDate();
    }
}
