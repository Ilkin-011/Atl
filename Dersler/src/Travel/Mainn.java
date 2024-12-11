package Travel;
public class Mainn {
    public static void main(String[] args) {
        Tour tour = new CityTour(34, 434,Enumm.CITY_TOUR);
        Tour tour1 = new BeachHoliday(33, 437,Enumm.BEACH_HOLIDAY);
        Tour[] toor = new Tour[2];
       toor[0]=tour;
       toor[1]=tour;
        for (Tour e : toor) {
            if (e.isReserved()) {
                e.displayInfo();
            }


        }
}
}
