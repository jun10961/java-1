package homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num1 = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("정수를 입력하세요: ");
            num1 = scanner.nextInt();
            sum = sum + num1;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }
    }
}
