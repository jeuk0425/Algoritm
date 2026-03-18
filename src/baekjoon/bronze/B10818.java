package baekjoon.bronze;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int first = sc.nextInt();

        int max = first;
        int min = first;
        // 첫 번째 값은 이미 입력받아서 max/min 초기화에 사용
        // 그러므로 나머지 count-1개만 반복문에서 처리
        for (int i = 1; i < count; i++) {
            int number = sc.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min + " " + max);
    }
}