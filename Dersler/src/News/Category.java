package News;

public class Category <A> {
    private A categoryName;

    public Category(A categoryName) {
        this.categoryName = categoryName;
    }

    public A getCategoryName() {
        return categoryName;
    }
}
