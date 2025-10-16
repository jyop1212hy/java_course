package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        //생성자 호출 인스턴스화
        Person person = new Person("haryun");

        //인스턴스 변수 접근
        // secret 변수는 접근제어자(캡슐화)가 private 으로 되어있어 Main 클래스에서는 접근 불가능
//        person.name = "haryun";
//        person.secret = "????";

        // 인스턴스 메서드 접근
        // methodA는 접근제어자가 public
        // methodB는 접근제어자가 private
//        person.methodA();
//        person.methodB();

        // 게터 (값에 접근)
        String name = person.getName();
        System.out.println("이름: " + name);

        // 세터 (값을 변경)
        person.setName("mavin");
        String name1 = person.getName();
        System.out.println(name1);


    }
}
