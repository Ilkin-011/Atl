package Travel;

public enum Tur {
    BEACH_HOLIDAY {
        @Override
        public void displayInfo() {
            System.out.println("standaart otagdi tek yataqlidir");
        }
    },
    CITY_TOUR {
        @Override
        public void displayInfo() {
            System.out.println("standaart otagdi tek yataqlidir");
        }
    },
    ;

    public abstract void displayInfo();
}