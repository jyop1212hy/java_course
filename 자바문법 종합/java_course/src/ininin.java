public class ininin {
}
// 추상 클래스
abstract class Animal {
    String name;                // 필드 가능
    void eat() { System.out.println("먹는다"); }  // 일반 메서드 가능
    abstract void sound();      // 추상 메서드
}

class Dog extends Animal {
    void sound() { System.out.println("멍멍"); }
}

// 인터페이스
interface Flyable {
    void fly();                 // 추상 메서드
    // Java 8 이후 default 메서드 가능
    default void info() { System.out.println("날 수 있음"); }
}

class Bird implements Flyable {
    public void fly() { System.out.println("날다"); }
}

class Airplane implements Flyable {
    public void fly() { System.out.println("비행기 날다"); }
}