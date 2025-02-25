package Thread;

public class myThread extends Thread {
    public void run() {
        System.out.println("privet " + myThread.currentThread().getName());
    }
    public static void main(String[] args) {
        var myThread=new myThread();
        myThread.run();
        myThread.start();
    }
}



