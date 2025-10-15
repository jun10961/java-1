package practice.Weak5;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("극장 티켓 종류: prime, standard, 또는 economy 중 한 가지를 입력하세요: ");
        String zone = scanner.next();
        switch (zone) { // 자바 7부터 문자열 사용 가능
            case "prime": // prime과 일치하면
                System.out.println("프라임존 표 값은 11000원입니다.");
                break;
            case "standard": // standard와 일치하면
                System.out.println("스탠다드존 표 값은 10000원입니다.");
                break;

            case "economy": // economy와 일치하면
                System.out.println("이코노미존 표 값은 9000원입니다.");
                break;

            default: // prime, standard, economy가 아니면
                System.out.println("좌석 종류를 잘못 입력했습니다.");
                break;
        }
    }
}