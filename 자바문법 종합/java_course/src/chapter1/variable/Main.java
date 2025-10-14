package chapter1.variable;

public class Main {
    public static void main(String[] args) {

        //[자료형] [변수이름] ;
        /*
        //정수형
        int a = 1;

        int b;
        b = 2;

        System.out.println("b = " + b);
        */
        
        //논리형
        boolean booleanBox = true;
        booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);

        //문자형
        char cHarBox = 'a';
        cHarBox = 'b';
        System.out.println("charBox = " + cHarBox);

        //정수형(long)
        long longBox = 1;
        longBox = 56784;
        System.out.println("longBox = " + longBox);

        //살수형(float)
        float floatBox = 1.2345678f;
        floatBox = 1.234567890f;
        System.out.println("doubleBox = " + floatBox);

        //살수형(double)
        double doubleBox = 1.23456789;
        doubleBox = 1.23456789;
        System.out.println("doubleBox2 = " + doubleBox);

        // 캐스팅(Casting)
        // 다운캐스팅 : 큰 데이터를 -> 작은 데이터로
        double bigBox = 10.23456789;
        int smallBox = (int)bigBox;
        System.out.println("bigBox = " + smallBox);

        // 업캐스팅 : 작은 데이터를 -> 큰 데이터로
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        System.out.println("bigBox2 = " + smallBox2);


        //실무에서 자주쓰이는 자료형
        // 문자열 데이터
        char a = 'a';
        String str = "안녕하세요!";
        //정수형
        int a2 = 1;
        long a3 = 1;
        //논리혈
        boolean b1 = true;
        boolean b2 = false;
    }
}
