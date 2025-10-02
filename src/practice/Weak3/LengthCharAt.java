package practice.Weak3;

public class LengthCharAt {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abcdef";
        System.out.printf("\"abc\"의 길이: %d\n", s1.length());
        System.out.printf("\"abcdef\"의 길이: %d\n", s2.length());
        System.out.printf("\"abc\"의 첫 번째 글자: %c\n", s1.charAt(0));
        System.out.printf("\"abcdef\"의 두 번째 글자: %c\n", s2.charAt(2));
        System.out.printf("\"abc\"와 \"abcdef\"를 비교하는 equals() 함수의 결과: %s\n", s1.equals(s2));
        System.out.printf("\"abc\"와 \"abcdef\"의 compareTo() 결과: %d\n", s1.compareTo(s2));
        System.out.printf("\"abc\"와 \"ABC\"의 compareToIgnoreCase() 결과: %d\n", s1.compareToIgnoreCase("ABC"));
        s1.contains("ab");
        s2.indexOf(s1);
        String fileName = "java.jpg";
        fileName.endsWith(".jpg");
        fileName.endsWith(".png");
        fileName.substring(5); // "jpg" 생성
        fileName.substring(0, 4); // "java" 생성
        String s4 = " new string \t ";
        String trimmedString = s4.trim();
        System.out.println(trimmedString);
    }
}
