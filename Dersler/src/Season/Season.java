package Season;

public enum Season {
    SPRING("Təbiətin canlanma dövrü.", 30, 25),
    SUMMER("İsti və gübnəşli günlər.", 40, 30),
    AUTUMN("Xəzan və sərin hava.", 20, 15 ),
    WINTER("Soyuq və qarlı günlər.", 0, -2 );
    private final String description;
    private final int maxTemprature;
    private final int minTemprature;
    public String getDescription() {
        return description;
    }
    Season(String description, int maxTemprature, int minTemprature) {
        this.description = description;
        this.maxTemprature = maxTemprature;
        this.minTemprature = minTemprature;
    }
    public int getMaxTemprature() {
        return maxTemprature;
    }
    public int getMinTemprature() {
        return minTemprature;
    }
    public String getFormatInfo(){
        return String.format("%s: %d ° C - %d° C (%s)",
        this.name(),minTemprature,maxTemprature,description);
    }
    }



