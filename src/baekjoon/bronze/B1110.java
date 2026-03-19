package baekjoon.bronze;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first_number = number; //첫번째값고정해야함 나중에 계속비교해서 처음입력받은값을 바뀌기때문
        int [] arr = new int[2];
        int cycle = 0;
        int new_number = 0;
        //처음에 무조건 한번은 실행되야하기떄문에 do_while문을 써야함
        do {
            arr[0] = number / 10;
            arr[1] = number % 10;

            int sum = arr[0] + arr[1];
            new_number = arr[1] * 10 + (sum % 10);
            cycle++;
            number = new_number;

        } while (number != first_number);
        System.out.println(cycle);
        }
    }

