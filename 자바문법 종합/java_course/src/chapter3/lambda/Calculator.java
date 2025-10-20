package chapter3.lambda;


@FunctionalInterface //함수형 인터페이스 꼭 구현해야함
public interface Calculator {

    int sum(int a, int b); //오직 하나의 추상 메서드만 선언해야합니다.
}
