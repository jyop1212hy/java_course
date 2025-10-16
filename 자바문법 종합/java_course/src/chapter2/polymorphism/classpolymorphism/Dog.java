package chapter2.polymorphism.classpolymorphism;

public class Dog extends Animal {


    @Override
    public void makeSound(){
        System.out.println("멍멍");
    }

    public void wag() {
        System.out.println("흔들흔들");
    }
}
