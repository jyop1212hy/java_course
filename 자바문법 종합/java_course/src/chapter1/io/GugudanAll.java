package chapter1.io;

import java.util.Scanner;

public class GugudanAll {
    public static void main(String[] args) {

        //구구단

            for (int i = 2; i <= 9; i++) {
                System.out.println("=== " + i + "단" + " ===");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();
        }
        }
    }
