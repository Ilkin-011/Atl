package Manager;

public class Maain {

    public static void main(String[] args) {
        Employee employee =new Employee(50,"Coshqun",2023,"Kapital");
        Menegeer menegeer = new Menegeer(200,"Ilkin ",2022,"Kapital","Kapitalın menegeri ",5);
        Director director = new Director(500,"Sebuhi",2020,"Kapital","Kapiatın menegeri  ",555);
        menegeer.work();
        director.work();
        employee.work();
    }
}
