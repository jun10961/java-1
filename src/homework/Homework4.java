package homework;
import java.util.Scanner;

public class Homework4 {
    int gcd(int m, int n){
        if (n==0){
            return m;
        }
        else if (n>m){
            return gcd(m, n % m);
        }
        else{
            return gcd(n, m % n);
        }
    }

    int gcd_iterative(int m, int n){
        if (n > m) {
            int num = n;
            n = m;
            m = num;
        }
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Homework4 hw = new Homework4();

        int result = hw.gcd(num1, num2);
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        result = hw.gcd_iterative(num1, num2);
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        scanner.close();
    }
}