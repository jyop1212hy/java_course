package chapter2.polymorphism.classpolymorphism;

abstract class Animal extends LifeForm {

    @Override
    public void exist(){
    System.out.println("나도 존재한다");
}

    public void makeSound() {
        System.out.println("소리를 냅니다.");
    }
}
