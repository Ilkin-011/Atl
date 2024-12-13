package News;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Neews<T, A extends Category, N extends Author> {
    private T newsTitle;
    private A category;
    private N author;
    private LocalDate date;

    public Neews(T newsTitle, A category, N author, LocalDate date) {
        this.newsTitle = newsTitle;
        this.category = category;
        this.author = author;
        this.date = date;
    }

    public T getNewsTitle() {
        return newsTitle;
    }

    public A getCategory() {
        return category;
    }

    public N getAuthor() {
        return author;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getFormatDate() {

        return date.format(DateTimeFormatter.ofPattern("dd/MMMM/yy"));

    }

    public void displayInfo() {
        System.out.println("Xəbər başlığı: " + getNewsTitle());
        System.out.println("Xəbər kategoriyasi: " + category.getCategoryName());
        System.out.println("Xəbər müellifi: " + author.getFullName());
        System.out.println("Xəbər zamanı: " + getFormatDate());
    }

    public static void main(String[] args) {
        ArrayList<Neews> arr = new ArrayList<>();
        Neews xeber1 = new Neews<>("real 3-2 qalib geldi", new Category("Idman"),
                new Author<>("Ilkin","Mirzeyev"), LocalDate.of(2024, 12, 12));
        Neews xeber2 = new Neews<>("real 3-3 oldu", new Category("Idman"),
                new Author<>("Ilkin", "Mirzeyev"), LocalDate.of(2023, 10, 02));
        arr.add(xeber1);
        arr.add(xeber2);
        for (Neews e : arr) {
            e.displayInfo();
            System.out.println("-----------------------");

        }
    }
}
