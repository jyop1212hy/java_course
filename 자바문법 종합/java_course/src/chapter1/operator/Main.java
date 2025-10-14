package chapter1.operator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        int a= 10;
        int b= 3;

        //기본적인 사직연산
        int sum = a+b;
        System.out.println("sum = " +sum);

        int sub = a-b;
        System.out.println("sub = " + sub);

        int mul = a*b;
        System.out.println("mul = " + mul);
        
        //나눗셈
        // 10 / 3
        int div = a/b;
        System.out.println("div = " + div);
        
        // a / 3.0
        double div2 = a / 3.0;
        System.out.println("div2 = " + div2);

        //모듈러 연산자 (나머지 연산) - %
        int mod = 10 % 3;
        System.out.println("mod = " + mod);
        
        int mod2 = 15%4;
        System.out.println("mod2 = " + mod2);
        
        int mod3 = 20%7;
        System.out.println("mod3 = " + mod3);
        
        //모듈러 연산 응용 - 시간 연산
        int mod4 = (10 + 5) % 12;
        System.out.println("time = " + mod4);
        
        //모율러 연산 응용 - 짝수 홀수 연산
        int mod5 = 6%2;
        System.out.println("mod5 = " + mod5);
        
        int mod6 = 7%2;
        System.out.println("mod6 = " + mod6);
        
        //대입 연산자
        int num = 5;
        //복합 대입 연산자
        num +=3; // num = num + 3;
        System.out.println("num = " + num);

        num -=2; // num = num - 2;
        System.out.println("num = " + num);

        num *= 2; // num = num * 2;
        System.out.println("num = " + num);

        num /= 3; // num = num / 2;
        System.out.println("num = " + num);

        num %= 3; // num = num % 2;
        System.out.println("num = " + num);

        //증감 연산자
        num = 1;
        num ++; // + 1
        num ++; // + 1
        num --; // - 1
        num --; // - 1
        System.out.println("num = " + num);

        // 전위 연산(++i) - 연산 후 값이 활용 됩니다.
        int intcox = 5;
        System.out.println("(++intcox) = " + (++intcox));

        // 후위 연산(i++) - 값먼저 활용후 연산 됩니다.
        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++));
        System.out.println("intBox2 = " + intBox2);

        //비교연산자
        //같음연산자(=) 같은면 true, 다르면 false
        System.out.println("10 == 10: " + (10 == 10));
        System.out.println("10 == 10: " + (10 == 6));

        //다름연산자 (!=) 다르면 true, 같은면 false
        System.out.println("10 != 5: = " + (10 != 5));
        System.out.println("10 != 5: = " + (10 != 10));

        // 크기 비교 연산자 ( > , < , <= , >= )
        System.out.println("10 < 5 : " + (10 < 5)); // false
        System.out.println("10 >= 10 : " + (10 >= 10)); //true
        System.out.println("10 <= 5 :  " + (10 <= 5)); // false

        // 논리연산자
        // AND 연산(&&) - 두 조건이 모두 참일때 true 반환합니다.
        System.out.println("true && true : " +(true && true)); //true
        System.out.println("true && false : " +(true && false)); //false

        int age =20;
        boolean isStudent = true;
        System.out.println("age : " + ((age > 18) && isStudent)); //true
        System.out.println("age : " + ((age > 28) && isStudent)); //false



        // OR 연산 (||) - 두 조건중 하나라도 참이라면 true 를 반환합니다.
        System.out.println("false || true : " + (false || true)); //true
        System.out.println("false || true : " + (false || false)); //false

        // NOT 연산자( ! ) true 일때 false 로, false 일때 true로 변경
        System.out.println("!true: " + (!true)); // false
        System.out.println("!false: " + (!false)); // true

        //기본 연산자 우선순위(산술 → 비교 → 논리 → 대입)
        boolean flag = ((10 + 5) > 12) && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        //논리 연산자 우선순위( ! → && → || )
        boolean result = true || (false && false);
        System.out.println("result = " + result);

        boolean result2 = true || (false && (!false));
        System.out.println("result2 = " + result2);
        // 실행 순서: true || (false && false)
        // → true || false
        // → true
        
        // 문자열비교 equals()를 활용 한다
        String text = "hello";
        String text2 = "hello";
        // 나쁜예: (text == text)
        
        boolean isEqual = text.equals(text2);
        System.out.println("isEqual = " + isEqual); //true
        */

        //실습과제 1
        int a = 15;
        int b = 4;

        int sum = a + b;
        System.out.println("sum = " + sum);
        int sub = a - b;
        System.out.println("sub = " + sub);
        int mul = a * b;
        System.out.println("mul = " + mul);
        int div = a / b;
        System.out.println("div = " + div);
        int mod = a % b;
        System.out.println("mod = " + mod);

        //실습과제 2
        int x = 1;
        int y = 2;

        boolean isGreater = x > y;
        boolean isSmaller = x < y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;

        System.out.println("x > y :" + isGreater);
        System.out.println("x < y :" + isSmaller);
        System.out.println("x == y :" + isEqual);
        System.out.println("x != y :" + isNotEqual);

        //실습과제 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 문자열을 입력하세요:");
        String str1 = scanner.nextLine();

        System.out.print("두 번째 문자열을 입력하세요:");
        String str2 = scanner.nextLine();

        boolean result = str1.equals(str2);

        System.out.println("두 문자열이 같은가요? " + result);
    }
}
