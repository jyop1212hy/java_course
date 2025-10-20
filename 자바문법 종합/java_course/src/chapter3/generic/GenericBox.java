package chapter3.generic;
//재네릭은 컴파일시 Object 로 변경된다
// T -> Object 변경
public class GenericBox<T> {
    //속성
    private T item;

    //생성자
    public GenericBox(T item){
        this.item = item;
    }

    //기능
    public T getItem() {
        return this.item;
    }

    //일반 메서트
    public void printItem(T item){
        System.out.println(item);
    }

    //제네릭 메서드
    public <S>void printBoxItem(S item){
        System.out.println();
    }




}
