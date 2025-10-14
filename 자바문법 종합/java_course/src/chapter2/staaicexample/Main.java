package chapter2.staaicexample;

public class Main {
    public static void main(String[] args) {

        // 클래스 멤버
        // static 변수활용
        System.out.println("static 변수 활용: " + Person.population);
        // static 메서드활용
        Person.printPopulation();

        //인스턴스 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();

        //인스턴스 변수 활용
        p1.name = "haryun";
        p2.name = "mavin";

        //인스턴스 메서드 활용
        p1.printName();
        p2.printName();

        Person.printPopulation();

    }
}
