package etc;

public class Test2 {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abcdef";
        System.out.printf("\"abc\"의 길이: %d\n", s1.length());
        System.out.printf("\"abcdef\"의 길이: %d\n", s2.length());
        System.out.printf("\"abc\"의 첫 번째 글자: %c\n", s1.charAt(0));
        System.out.printf("\"abcdef\"의 두 번째 글자: %c\n", s2.charAt(2));
    }
}
