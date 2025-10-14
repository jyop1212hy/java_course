package chapter2.wrapper;

public class PrimitiveVsWrapper {
    public static void main(String[] args) {
        int iteration = 10_000_000; // 1000만 번 반복

// 기본형 int 연산 성능 테스트
        long startTime1 = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < iteration; i++) {
            sum1 += i; // 기본형 연산
        }
        long endTime1 = System.nanoTime();
        long primitiveTime = endTime1 - startTime1;

// 래퍼 클래스 Integer 연산 성능 테스트
        long startTime2 = System.nanoTime();
        Integer sum2 = 0;
        for (int i = 0; i < iteration; i++) {
            sum2 += i; // 오토박싱 & 언박싱 발생
        }
        long endTime2 = System.nanoTime();
        long wrapperTime = endTime2 - startTime2;

// 결과 출력
        System.out.println("기본형(int) 연산 시간: " + primitiveTime + " ns");
        System.out.println("래퍼 클래스(Integer) 연산 시간: " + wrapperTime + " ns");
        System.out.println("성능 차이 (배수): " + (double) wrapperTime / primitiveTime);
}
}
