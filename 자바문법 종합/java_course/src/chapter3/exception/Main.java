package chapter3.exception;

public class Main {
    public static void main(String[] args) {

        // 1. 의도하지 않은 예외 (RuntimeException - UncheckedException)
//        int ret = 10/0;
//        System.out.println(ret);

        // 2. 의도적인 예외 - throw (Exception - CheckedException)
//        int age = 10;
//        if (age < 18) {
//            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
//        }
//        System.out.println("프로그램 종료");

        // 3. 언체크 예외 호출
        ExceptionPractice exceptionPractice = new ExceptionPractice();
//        try {
//            exceptionPractice.callUncheckedException();
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리");
//        }

        // 4. 체크(Exception - CheckedException) 예외 호출
        try {
            exceptionPractice.callCheckedException();
        } catch (Exception ex) {
            System.out.println("체크 예외 처리");
        }

        System.out.println("프로그램을 종료");



    }
}
