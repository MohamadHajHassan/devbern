package devbern.asg6;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        this.name = "Unknown";
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Mary Jo");
        Student student3 = new Student("Mohamad");

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());
    }
}
