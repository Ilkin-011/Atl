package Generics;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            Student student = new Student("Ilkin", 1);
            Student student1 = new Student("Azer", 2);
            Student student2 = new Student("Sebuhi", 3);
            Course java = new Course<>("Java", Subject.JAVA);
            Course C = new Course<>("C", Subject.C);
            Course python = new Course<>("Phyton", Subject.PHYTON);
            operations.registerStudent(student, java);
            operations.registerStudent(student1, C);
            operations.registerStudent(student2, python);
        } catch (IsExisteException | IsNotExistException e) {
            System.out.println(e.getMessage());
        } finally {
            operations.displayInfo();
        }
//        String s ="2";
    }
}
