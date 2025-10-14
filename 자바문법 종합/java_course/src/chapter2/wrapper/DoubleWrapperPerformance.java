package chapter2.wrapper;

public class DoubleWrapperPerformance {
    public static void main(String[] args) {
        int iteration = 10_000_000; // 1000만 번 반복

        // 1. 기본형 double 연산
        long startTime1 = System.nanoTime();
        double sum1 = 0.0;
        for (int i = 0; i < iteration; i++) {
            sum1 += i * 1.1;
        }
        long endTime1 = System.nanoTime();
        long primitiveTime = endTime1 - startTime1;

// 2. MyDouble 연산
        long startTime3 = System.nanoTime();
        MyDouble sum3 = new MyDouble(0.0);
        for (int i = 0; i < iteration; i++) {
            sum3 = sum3.add(new MyDouble(i * 1.1));
        }
        long endTime3 = System.nanoTime();
        long myDoubleTime = endTime3 - startTime3;

// 결과 출력
        System.out.println("기본형(double) 연산 시간: " + primitiveTime + " ns");
        System.out.println("MyDouble 클래스 연산 시간: " + myDoubleTime + " ns");
        System.out.println("MyDouble vs double 성능 차이: " + (double) myDoubleTime / primitiveTime);

    }
}
