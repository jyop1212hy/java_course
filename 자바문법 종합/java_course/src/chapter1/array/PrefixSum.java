package chapter1.array;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,5,8};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("누적합: " + sum);
    }
}
