package chapter2.capsulation;

public class Person {

    // 1.속성
    private String name;
    private String secret;

    // 2.생성자
    // public 이 없으면 자동 default 됨
    public Person(String name) {
        this.name = name;
    }

    // 3.기능
    private void methodA() {
    }

    private void methodB() {
    }

    // 게터
    public String getName() {
        return name;
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }
}
