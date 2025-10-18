package chapter3.collection.ex;

public class Product {

    //ArrayList 실습 과제

    //속
    //변수형으로 만들것
    private String name;
    private int price;
    //생
    //여러개 만들수 있고
    //클래스명 동일
    //반환 타입 없음//
    public  Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    //기
public String getName(){
        return this.name;
}

public int getPrice(){
    return this.price;
}
}
