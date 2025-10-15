package practice.Weak5;

import java.util.Scanner;

public class ZeroTo100 {
    public static void main(String[] args){
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("0이 아닌 정수를 입력하세요 100이상이면 종료됩니다");
            num = scanner.nextInt();
            if(num == 0) {
                continue;
            }
            else {
                System.out.println(num);

            }
        }  while (num<100);
    }
}
