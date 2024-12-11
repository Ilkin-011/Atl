package Travel;

public enum Tur {
    BEACH_HOLIDAY {
        @Override
        public void displayInfo() {
            System.out.println("Sade turdu  huvuzlu");
        }
    },
    CITY_TOUR {
        @Override
        public void displayInfo() {
            System.out.println("Seher gezintisi hovuzsuz");
        }
    },
    ;

    public abstract void displayInfo();
}