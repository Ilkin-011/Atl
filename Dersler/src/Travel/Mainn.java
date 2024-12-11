package Travel;

public class Mainn {
    public static void main(String[] args) {
        Tour tour = new Tour(34, 434, Tur.CITY_TOUR);

        Tour tour1 = new Tour(33, 437, Tur.BEACH_HOLIDAY);
        Tur.CITY_TOUR.displayInfo();
        Tur.BEACH_HOLIDAY.displayInfo();
    }

}

//        Tour[] toor = new Tour[2];
//       toor[0]=tour;
//       toor[1]=tour;
//        for (Tour e : toor) {
//            if (e.isReserved()) {
//                e.displayInfo();
//            }


