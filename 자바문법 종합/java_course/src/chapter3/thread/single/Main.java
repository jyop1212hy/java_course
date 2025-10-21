package chapter3.thread.single;

public class Main {
    public static void main(String[] args) {
        System.out.println("::: main 쓰레드 시작");
        String threadName = Thread.currentThread().getName();

        // 하나의 작업: 숫자를 0~9까지 출력
        for (int i =0; i < 10; i++) {
            System.out.println("현재 쓰레드 이름: " + threadName + " - " + i);
            try {
                Thread.sleep(500); // 0.5초 딜레이
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("::: 작업 끝 :::");
    }
}
