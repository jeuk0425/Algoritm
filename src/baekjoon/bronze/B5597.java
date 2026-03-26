package baekjoon.bronze;

import java.util.Scanner;

public class B5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] students = new int[31];

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            students[num] = 1;
            }
        for (int i = 1; i <= 30; i++) {
            if (students[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
