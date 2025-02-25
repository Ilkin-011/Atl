package Task2;

public class Studentt {
    private String studentName;
    private Integer Id;

    public Studentt(String studentName, Integer id) {
        this.studentName = studentName;
        Id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }


    @Override
    public String toString() {
        return "Studentt{" +
                "studentName='" + studentName + '\'' +
                ", Id=" + Id +
                '}';
    }
}

