package chapter1.cindution;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        String Light =  scanner.nextLine();

        if (Light.equals("초록불")){
            System.out.println("건너세요!");

        } else if (Light.equals("노란불")) {
            System.out.println("주의하세요!");

        }  else if (Light.equals("빨간불")) {
            System.out.println("멈추세요!");

        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
