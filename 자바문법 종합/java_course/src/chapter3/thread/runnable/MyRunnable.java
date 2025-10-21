package chapter3.thread.runnable;

public class MyRunnable extends MynewClass implements Runnable{
    @Override
    public void run(){
        String threadname = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드" + threadname);

        for(int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드 : " + threadname + " - " + i);
            try {
                Thread.sleep(500);// 딜레이 0.5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("종료된 쓰레드" + threadname);
    }

}
