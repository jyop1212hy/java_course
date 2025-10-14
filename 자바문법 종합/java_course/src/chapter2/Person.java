package chapter2;

public class Person {
    // 1. 속성 - 변수 선언으로 표현할 수 있습니다.
    String name;
    int age;
    String address;

    // 2. 생성자 - 조립설명서
    // 기본생성자: person() {}
    // 생성자의 특징
    // 1)클래스와 이름이 같아야 합니다.
    // 2)반환 타입이 존재하지 않습니다.
    // 3)여러개가 존재할 수 있습니다.
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 3. 기능(메서드 부분)
    int sum(int value1, int value2){
     int result = value1 + value2;
        return result;
    }

    //게터- 현재 속성을 가져오는 기능
    String getName() {
        return name;
    }
    //세터
    void setAddress(String address) {
        this.address = address;
    }

}

