package Student;

public class Main {
    public static void main(String[] args) {
        try{
            Register register =new Register();
            Student student=new Student("Ilkin",34);
            Student student1=new Student("Farid",33);
            Student student2=new Student("Ceyhun",32);
            register.add(student);
            register.add(student1);
            register.add(student2);
            register.searchStudent("Illkin");
            register.showAll();
        }

        catch (NotFoundException |FoundException exception ){
            System.out.println(exception.getMessage());
        }
    }
}
