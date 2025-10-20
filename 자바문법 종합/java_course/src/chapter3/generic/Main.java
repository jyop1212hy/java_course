package chapter3.generic;

public class Main {
    public static void main(String[] args) {

        //1. 재사용 불가
        Box box1 = new Box(100);
//        new Box("abc");
//        new Box(0.1);
        
        //2. 낮은타입 안정성
        ObjectBox strBox = new ObjectBox("abc");
        ObjectBox intBox = new ObjectBox(100);
        
        // Object item속성를 활용하기 위해서는 down casting 필요
        String item = (String)strBox.getItem();
        System.out.println("item = " + item);

        // String item2 = (String)intBox.getItem(); 언체크드 에러 발생

        // 제네릭 활용
        // 1. 재사용성 보장 (타입 소거: T -> object)
        GenericBox<String> strGBox= new GenericBox<String>("abc");
        GenericBox<Integer> intGBox= new GenericBox<Integer>(100);
        GenericBox<Double> doubleGBox= new GenericBox<>(0.1);


        // 2. 타입안정성 보장 (타입소거: 자동으로 down casting 삽입)
        String strGBoxItem = strGBox.getItem();
        System.out.println("strGBoxItem = " + strGBoxItem);

        Integer intGBoxitem = intGBox.getItem();
        System.out.println("intGBoxitem = " + intGBoxitem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);


        //일반 메서드 (String 기준으로 타입소거 발생으로 정수,실수 체크드 오류 발생)
        //컴파일 시점에 String으로 다운캐스팅이 되었고 타입소거 되었기에 재활용 불가

        strGBox.printItem("ABC");
//        strGBox.printItem(100);
//        strGBox.printItem(0.1);

        //제네릭 메서드(String 과 상관없음)
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(100);
        strGBox.printBoxItem(0.1);


    }
}
