package News;

public class Author <N>{
    private N firstName;
    private N surName;

    public Author(N firstName, N surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public N getFirstName() {
        return firstName;
    }

    public N getSurName() {
        return surName;
    }
    public String getFullName(){
      return firstName+ " "+ surName;
    }
}
