package Streamm;

import java.util.List;

public class Father {
    private String name;
    private List<Child> child;

    public Father(String name) {
    }

    public Father(String name, List<Child> child) {
        this.name = name;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChild() {
        return child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }
}
