package Generics;

import java.util.ArrayList;
import java.util.List;

public class Course <A>{
    private A courseName;
    private List<Student> students;

    public Course(A courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public A getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
        System.out.println(courseName +" kursuna " +student.getName()+ " Telebe elave edildi");
    }
    public void displayInfo(){
        for (Student s:students){
            System.out.println( "\nTelebe: " + s.getName());
        }
    }
}
