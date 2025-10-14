package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        // println 사용
        System.out.println("Hello");
        System.out.println("Java");

        // print 사용
        System.out.print("안녕");
        System.out.print("자바");

        // 개행문자 사용
        System.out.println("Hello\nWorld!");

        // 입력(Scanner)
        //스캐너 객체를 스캐너형 박스(scanner)
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("좋아하는 문장: " + sentence);

        //정수형(int, long) 입력받기
        System.out.print("정수를 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)을 입력하세요: ");
        long longBox = scanner.nextLong();
        System.out.println("intBox = " + longBox);
        
        //실수
        System.out.print("소수점(double)을 입력하세요: ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);
        */

        //실습과제
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("출력 결과:");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);

    }
}