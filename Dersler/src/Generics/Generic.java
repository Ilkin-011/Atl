package Generics;

import java.util.Objects;

public class Generic <T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
    public static void main(String[] args) {
        Generic<String>t=new Generic<>("Java");
        Generic<Integer>s=new Generic<>(100);
        System.out.println(s.getKey() +":"+ t.getKey());
    }
}
