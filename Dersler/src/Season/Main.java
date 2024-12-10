package Season;

public class Main {
    public static void main(String[] args) {
        for (Season v : Season.values()) {
            System.out.println(v.getFormatInfo());
        }
    }
}
