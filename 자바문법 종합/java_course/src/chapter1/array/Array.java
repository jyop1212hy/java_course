package chapter1.array;

public class Array {
    public static void main(String[] args) {

        // 1. 배열 선언
        int[] arr1;
        // 2. 배열 길이 할당
        arr1 = new int[5];
        // arr = [] [] [] [] [] <- 빈공간

        // 3. 배열 선언과 길이 동시에 할당
        int[] arr3 = new int[5];

        // 4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr4 = {1,2,3,4,5};
        // [1] [2] [3] [4] [5]

        // 5.배열의 길기
        int arrlength = arr4.length;
        System.out.println(arrlength);

        // 문자열 배열 선언
        String[] strArr = new String[5]; // ["as"] ["ab"] ["ad"] ["ac"] ["af"]

        //논리형 배열 선언
        boolean[] boolArr = new boolean[3]; // [true] [false] [true]

        // 배열의 요소에 접근: 인데스 왈용 방법
        int[] arr5 = {10, 20, 30, 40, 50};
        //            [0] [1] [2] [3] [4]
        System.out.println("배열의 1번째 요소 접근: " + arr5[0]);
        System.out.println("배열의 2번째 요소 접근: " + arr5[1]);
        System.out.println("배열의 3번째 요소 접근: " + arr5[2]);
        System.out.println("배열의 4번째 요소 접근: " + arr5[3]);
        System.out.println("배열의 5번째 요소 접근: " + arr5[4]);

        arr5[0] = 100;
        arr5[1] = 200;
        arr5[2] = 300;
        arr5[3] = 400;
        arr5[4] = 500;
        System.out.println("배열의 1번째 요소 접근: " + arr5[0]);
        System.out.println("배열의 2번째 요소 접근: " + arr5[1]);
        System.out.println("배열의 3번째 요소 접근: " + arr5[2]);
        System.out.println("배열의 4번째 요소 접근: " + arr5[3]);
        System.out.println("배열의 5번째 요소 접근: " + arr5[4]);
        //  0       1      2       3       4
        //[100]   [200]  [300]   [400]   [500]
        //System.out.println(arr5[5]); // 없는 배열 요청시 오류발생: Index 5 out of bounds for length 5


        // 배열 탐색
        for (int i = 0; i < arr5.length; i++) {
            System.out.println("인덱스: " + i + ", 값"+ arr5[i]);
        }

        //향상된 for문
        // arr [100] [200] [300] [400] [500]
        for (int a: arr5) {
            System.out.println("값: " + a);
        }
        // [] []
        // [] []
        boolean[][] board = {
                {true, false},
                {false, true}
        };
        System.out.println(board[0][0]);
        System.out.println(board[0][1]);

    }
}
