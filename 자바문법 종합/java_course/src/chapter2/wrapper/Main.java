package chapter2.wrapper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. 기본형
        int a = 1;
        System.out.println("a = " + a);

        // 2. 참조형 변수
        Person personA = new Person();
        System .out.println("personA" + personA);

        int []arr = {1,2,3,4,5};
        System.out.println("arr = " + arr);

        // 래퍼클래스 (기본형 변수를 감싸고 있는 클래스)
        // 참조형변수 입니다.
        Integer num = 10;
        System.out.println("num = " + num);
        String num1 = num.toString();
        System.out.println("num1 = " + num1);

        // 직접 만든 래퍼클래스
        chapter2.wrapper.CustomInteger myInteger = new CustomInteger(10);
        java.lang.String myStrinteger = myInteger.toString();

        // 오토박싱 (기본형 -> 래퍼클래스)
        Integer num3 = 10;
        //Integer num3 = Integer.valueOf(10);

        // 오토 언박싱
        int num4 = num3;
        // int num4 = num.intValue();
    }
    }
