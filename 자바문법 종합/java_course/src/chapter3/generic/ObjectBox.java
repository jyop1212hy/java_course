package chapter3.generic;

public class ObjectBox {
    //속성
    private Object item;

    //생성자
    public ObjectBox(Object item) {
        this.item = item;
    }
    //기능
    public Object getItem(){
        return item;
    }
}
