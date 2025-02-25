package Curse;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[]students= {
                new Student("Ilkin", LocalDate.of(2000, 10, 19)),
                new Student("Cavad", LocalDate.of(2001, 10, 19)),
                new Student("Firuze", LocalDate.of(2010, 10, 19)),
        };
        System.out.println("clone method");
       Student[]cloneCopy =students.clone();
        for (Student student:cloneCopy){
            System.out.println(student);
        }
        System.out.println("\ncopy method");
       Student [] copiedStudents = Arrays.copyOf(students,students.length);
       for (int i =0;i<cloneCopy.length;i++){
           System.out.println(cloneCopy[i]);
       }
        System.out.println("\nyasi 18 -den kicik olanlar");
           for (Student student:cloneCopy){
               if (student.getAge()<18){
                   System.out.println(student.getName() + " yas :" + student.getAge());
               }
           }
        }
        }






