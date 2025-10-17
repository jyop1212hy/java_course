package ex;

/***
 * 고양이 설계도
 */
public class Cat {

    // 속
    String name;
    int age;
    boolean isNeutering;

    // 생
    // 기본생성자
    // Cat() {}
    // 1. 클래스와 동일한 이름
    // 2 .반환 데이터가 없다.
    // 3. 여러개 존재할수 있다.
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Cat(String name, int age,  boolean isNeutering) {
        this.name = name;
        this.age = age;
        this.isNeutering = isNeutering;

    }

    // 기
    // getter - 속성을 가져오는 기능

    public String getName() {
        return this.name;
    }

    public boolean getNeutering(){
        return this.isNeutering;
    }

    public void setNeutering(boolean neutering) {
        this.isNeutering = neutering;
    }
}
