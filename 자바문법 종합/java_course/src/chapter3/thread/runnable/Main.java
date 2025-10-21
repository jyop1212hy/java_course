package chapter3.thread.runnable;

public class Main {
    public static void main(String[] args) {

        //하나의 작업의 작업객체 선언
        MyRunnable myTask = new MyRunnable();

        // 기능을 확장해서 사용
        myTask.printMessage();


        // 하나의 작업을 여러 쓰레드에서 공유
        Thread myTask0 = new Thread(myTask);
        Thread myTask1 = new Thread(myTask);

        myTask0.start();
        myTask1.start();

    }
}
