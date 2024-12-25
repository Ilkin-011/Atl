package GenericQueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {
        Queue<T>queue=new LinkedList<>();

    public void enqueue(T a){
        queue.add(a);
    }
    public void dequeue (T a){
            queue.poll();
    }
    public void isEmpty(){
        try{
            queue.element();
        }catch (Exception e){
            System.out.println("queue boshdur");
        }
    }

    public GenericQueue() {
    }
        public void goster(){
        queue.forEach(System.out::println);
        }
    public static void main(String[] args) {
        GenericQueue a1=new GenericQueue();
        a1.enqueue("salam");
        a1.enqueue("salammm");
        a1.dequeue(a1);
        a1.isEmpty();
        a1.goster();
    }
}


