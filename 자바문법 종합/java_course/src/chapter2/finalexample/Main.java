package chapter2.finalexample;

public class Main {
    public static void main(String[] args) {

        // final  값 변경 불가 또는 참조 변경 불가를 의미
        // 1. 변수는 변경이 불가능하게 만듭니다.
        // 2. 클래스는 상속할 수 없게 만듭니다.
        // 3. 메서드는 수정할 수 없게 만듭니다.(오버라이딩 불가)
        final int a =1;
    //   a = 2;    //  final  변수는 변경이 불가능하게 만듭니다.
        System.out.println("a = " + a);


        // 상수 활용 방법
        System.out.println("상수 활용: " + Circle.PI);

        // 불변 객체 활용
        final Circle c1 = new Circle(2);
        // 참조 변견은 막지만 내부값 변경은 막지 못함
//        c1 = new Circle(4);
        c1.radius = 4;
        System.out.println("c1 = " + c1);

        // 불변 객체의 내부상태가 변경이 필요한 경우
        Circle c2 = new Circle(10); // 1)객체를 새로 만든다.

        Circle c3= c2.changeRadius(20); // 2) 기능 활용후 또 다시 새로운 객체(변수)를 만들수 있다.
    }
}
