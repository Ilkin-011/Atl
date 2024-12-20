package Thread;

public class MultiThread {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.print("bb"+ " ");
                }
            }
        };

        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.print("aa " + " ");
                }
            }

        };
        thread.start();
        thread1.start();
    }
}
