package Generics;

public class Main {
    public static void main(String[] args) {
        Course<String> course = new Course<>("Atl");
        Student student = new Student("Ilkin",1);
        Student student1 = new Student("Azer",2);
        Student student2 = new Student("Sebuhi",3);
        course.addStudent(student);
        course.addStudent(student1);
        course.addStudent(student2);
        course.displayInfo();


    }
}
