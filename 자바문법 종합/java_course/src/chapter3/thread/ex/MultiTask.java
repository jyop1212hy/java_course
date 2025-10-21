package chapter3.thread.ex;

public class MultiTask implements Runnable {

    //    멀티 쓰레드는 4개의 쓰레드가 각각 숫자를 나누어 계산합니다.
//            1 ~ 250
//            251 ~ 500
//            501 ~ 750
//            751 ~ 1000
//    두 방법의 실행 시간을 비교하여 멀티 쓰레드가 얼마나 더 빠른지 확
//    인해 보세요.

    private int start;
    private int end;
    private long partialSun;

    //    멀티 쓰레드는 4개의 쓰레드가 각각 숫자를 나누어 계산합니다.
//            1 ~ 250
//            251 ~ 500
//            501 ~ 750
//            751 ~ 1000
//    두 방법의 실행 시간을 비교하여 멀티 쓰레드가 얼마나 더 빠른지 확
//    인해 보세요.
    public MultiTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public long getPartialSum() {
        return this.partialSun;
    }

    @Override
    public void run() {
        for (int i = this.start; i <= this.end; i++) {
            this.partialSun += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
