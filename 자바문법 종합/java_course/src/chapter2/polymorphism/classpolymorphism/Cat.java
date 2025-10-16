package chapter2.polymorphism.classpolymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound(){
        System.out.println("야옹");
    }

    public void scratch(){
        System.out.println("스크래치");
    }
}
