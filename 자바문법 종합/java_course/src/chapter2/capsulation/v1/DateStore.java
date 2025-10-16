package chapter2.capsulation.v1;

// 핵시설 관리 개발자
public class DateStore {

    // "B" 문자열이 들어오면 핵폭발 발생!!
    private String store;

    public void setStore(String a) {
        if (a.equals("b")) {
            System.out.println("B 문자는 사용하실수 없습니다.");
        } else {
            this.store = a;
        }
    }
}