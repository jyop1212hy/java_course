package chapter2.interitance.abstractexample;

//추상클래스 선언
abstract class Animal {
    public String name;

    abstract void a();
    abstract void b();

    public void sleep(){
        System.out.println("zzz....");
    }
    //디자인패턴???
}
