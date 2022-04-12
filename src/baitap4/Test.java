package baitap4;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Name sutdent 1");
        student1.setClasses("Student 1 class");

        student2.setName("Name student 1");
        student2.setClasses("Studen 2 class");

        System.out.println(student1.getName() + student1.getClasses());

    }
}
