package Generics;

import java.util.ArrayList;

public class Student {
    private String name;
    private Integer studentId;
    private ArrayList<Course<Student>> courses;

    public Student(String name, Integer studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void addStudent(Course<Student> course) {
        this.isExiste(course);
        courses.add(course);
    }

    public void removeStudent(Course<Student> course) {
        this.isNotExiste(course);
        courses.add(course);
    }

    private void isExiste(Course<Student> course) {
        if (courses.contains(course)) {
//            throw new IsExisteException("var");
            System.out.println("Salam");
        }
    }

    private void isNotExiste(Course<Student> course) {
        if (!courses.contains(course)) {
            throw new IsExisteException("yoxdur");
        }
    }
}