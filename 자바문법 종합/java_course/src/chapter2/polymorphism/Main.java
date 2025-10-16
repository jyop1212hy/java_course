package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {

        //다형성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal2.makeSound();

        animal2.exist();
        animal2.makeSound();

        // 업캐스팅 주의사항
//        animal1.scratch();
//        animal2.wag();

        //다운캐스팅
        Cat cat = (Cat) animal1; //명시적 형병환
        cat.scratch(); //자식 클레스 기능 메서드 직접 호출
        Dog dog = (Dog) animal2;
        dog.wag();


        // 잘못된 대운캐스팅 문제
        // 문법적으로 잘못된건 아니라서 에러가 발생하지 않습니다.(컴파일해야 알수 있음)
//        Cat cat1 = (Cat) animal2;
//        cat1.scratch();

        // 다운캐스팅시 instanceof 활용 방법
        if(animal1 instanceof Cat) {
            Cat cat2 = (Cat) animal1;
            cat2.scratch();
        } else {
            System.out.println("객체가 고양이가 아닙니다!");
        }

        Animal[] animals = {new Cat(), new Dog()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
