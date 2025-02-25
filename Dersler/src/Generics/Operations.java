package Generics;

import java.util.ArrayList;

public class Operations {
    private ArrayList<String> a = new ArrayList<>();

    public void registerStudent(Student students, Course<Student> course) {
        course.addStudent(students);
        students.addStudent(course);
        addLogg(students.getName() + " adli telebe " + course.getCourseName() + " kursuna elave edildi");

    }
    private void removeStudent(Student students, Course<Student> course) {
        course.removeStudent(students);
        students.removeStudent(course);
        addLogg(students.getName() + " adli telebe " + course.getCourseName() + " kursdan silinidi");
    }

    private void addLogg(String message) {
        a.add(message);
    }

    public void displayInfo() {
        int i = 0;
        for (String log : a) {
            i++;
            System.out.println(i + ". " + log);
        }
    }
}

