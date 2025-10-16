package chapter2.polymorphism.classpolymorphism;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        // 사용불가 - 다운캐스팅 필요
//        animal.scratch();

        // 다운캐스팅
        Cat cat = (Cat) animal1;
        cat.scratch();

        // 다운캐스팅 주의사항
        if (animal1 instanceof Cat) {
            Cat cat1 = (Cat) animal1;
            cat1.scratch();
        } else {
            System.out.println("고양이 객체가 아닙니다.");
        }
        //cat1.scratch();
    }
}