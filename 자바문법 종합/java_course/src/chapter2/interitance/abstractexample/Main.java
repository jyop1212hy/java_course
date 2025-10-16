package chapter2.interitance.abstractexample;

public class Main {
    public static void main(String[] args) {

        //추상 클래스는 객체(인스턴스화)생성을 할 수 없습니다.
        // Animal animal = new Animal();
        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();

        //자식에서 강제 구현된 메서드
        cat.a();
        cat.b();
    }
}
