package Generics;

import java.util.ArrayList;
import java.util.List;

public class Course <A>{
    private A courseName;
    private List<Student> students;

    public Course() {
    }

    public Course(A courseName, Subject subject) {
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
        isExist(student);
        students.add(student);
        students.remove(student);
        System.out.println(courseName +" kursuna " +student.getName()+ " Telebe elave edildi");
        System.out.println(courseName +" kursundan " +student.getName()+ " Telebe silindi");
    }
    public void displayInfo(){
        for (Student s:students){
            System.out.println( "\nTelebe: " + s.getName());
        }
    }
    private void isExist(Student s){
        if(!students.contains(s));
//       throw new IsExisteException("telebe var");
        System.out.println();
    }
    private void isNotExist(Student s){
        if(!this.students.contains(s));
        throw new IsNotExistException("telebe elave olunub");
    }
    public void removeStudent(Student student) {
        this.isNotExist(student);
        students.remove(student);

    }
}
