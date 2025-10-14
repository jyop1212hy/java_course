package chapter1.method;

public class Main {
    public static void main(String[] args) {
        // 1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();

        // 2. 메서드(함수)를 호출 - 반환값 있는경우
         int a = calculator.sum(1,2);
        System.out.println("결과는: " + a);

        // 2. 메서드(함수)를 호출 - 반환값 있는경우
        // int a = calculator.sum(1,2);
    }
}
