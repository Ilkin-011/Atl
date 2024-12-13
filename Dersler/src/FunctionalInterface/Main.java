package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
//        CustomConcumer<Integer> concumer = System.out::println;
//        concumer.total(31);

//        CustomPredicate<Integer> p = (a) -> a % 2 == 0;
//        System.out.println(p.test(4));
       CustomFunction<Integer,Integer,Boolean> t= (a,z) -> a<z ;
        System.out.println(t.plus(3,2));
    }

}
