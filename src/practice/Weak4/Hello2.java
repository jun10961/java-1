package practice.Weak4;

public class Hello2 {
    String toWhom = "world";
    Hello2() {
        System.out.println("기본 생성자가 호출됨.");
    }
    Hello2(String whom) {
        System.out.println("문자열 인자를 받는 생성자가 호출됨");
        toWhom = whom;
    }
    void setWhom(String whom) {
        toWhom = whom;
    }
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}
