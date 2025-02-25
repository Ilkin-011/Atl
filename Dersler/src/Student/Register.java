package Student;

import java.util.HashSet;
import java.util.Set;

public class Register {
    private Set<Student> students;
    public Register() {
        this.students = new HashSet<>();
    }
    public void add(Student student) {
        this.students.add(student);
        System.out.println(student + " tələbə qeydiyyata alındı");
    }
    public void showAll() {
        if (!students.isEmpty()) {
            for (Student e : students){
                System.out.println(e);
            }
        }
        throw  new NotFoundException("Telebe tapilmadi");
    }
    public void searchStudent(String string) {
        for (Student student : students) {
            if (student.getName().equals(string)) {
                System.out.println("Found student : " + student);
                return;
            }
        }
        System.out.println("not found " + string);
    }
}
