package GenericQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenericQueue<T> {
        Queue<T>queue=new LinkedList<>();

    public void enqueue(T a){
        queue.add(a);
    }
    public void dequeue (){
            queue.poll();
    }
    public void isEmpty(){
        try{
            queue.element();
        }catch (Exception e){
            System.out.println("queue boshdur");
        }
    }
    @Override
    public String toString() {
        return "GenericQueue{" +
                "queue=" + queue +
                '}';
    }
    public GenericQueue() {
    }
        public void goster(){
        queue.forEach(System.out::println);
        }
    public static void main(String[] args) {
        GenericQueue <String>a1=new GenericQueue();
        GenericQueue <Integer>a2=new GenericQueue();
        List<?> al = Arrays.asList(a1,a2);
        a1.enqueue("sa");
        a2.enqueue(2);
        al.forEach(System.out::println);
//        a1.dequeue();
//        a2.dequeue();
        a1.isEmpty();
        System.out.println(al);
    }
}


