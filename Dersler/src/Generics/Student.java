package Generics;

public class Student {
    private String name;
    private Integer studentId;

    public Student(String name, Integer studentId) {
        this.name = name;
        this.studentId = studentId;
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

}
