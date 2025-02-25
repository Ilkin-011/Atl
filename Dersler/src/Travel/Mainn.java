package Travel;

public class Mainn {
    public static void main(String[] args) {
        Tour tour = new Tour(34, 434, Tur.CITY_TOUR);
        Tour tour1 = new Tour(33, 437, Tur.BEACH_HOLIDAY);
        Tur.CITY_TOUR.displayInfo();
        Tur.BEACH_HOLIDAY.displayInfo();
    }
}


