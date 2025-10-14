package chapter2.wrapper;

class MyDouble {

    // 1. 속성
    private final double value;

    // 2. 생성자
    public MyDouble(double value){
        this.value = value;
    }

    // 3. 기능
    public double getValue() {
        return value;
    }

    // 덧셈
    public MyDouble add(MyDouble other){
        return new MyDouble(this.value + other.value);
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
