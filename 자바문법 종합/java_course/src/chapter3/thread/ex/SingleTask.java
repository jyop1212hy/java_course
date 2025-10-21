package chapter3.thread.ex;

public class SingleTask {

    //    요구사항
//1 부터 1000 까지의 숫자 합계를 구합니다.

//    싱글
//    쓰레드는 하나의 루프로 계산합니다.
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
//    멀티 쓰레드는 4개의 쓰레드가 각각 숫자를 나누어 계산합니다.
//            1 ~ 250
//            251 ~ 500
//            501 ~ 750
//            751 ~ 1000
//    두 방법의 실행 시간을 비교하여 멀티 쓰레드가 얼마나 더 빠른지 확
//    인해 보세요.
    }
}
