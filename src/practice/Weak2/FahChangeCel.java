package practice.Weak2;

import java.util.Scanner;

public class FahChangeCel {
    public static void main(String[] args) {
        double cel;
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.print("화씨온도를 입력하시오: ");
        double far = scanner.nextDouble();
        cel = ((float)5/9)*(far-32);
        System.out.printf("섭씨온도는 %.1f도 입니다.", cel);
    }
}
