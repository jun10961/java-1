package practice.Weak4;

public class TestHelloArray {
    public static void main(String[] args) {
        Hello[] helloArray = new Hello[3];
        helloArray[0] = new Hello();
        helloArray[1] = new Hello("홍길동");
        helloArray[2] = new Hello("허균");
        helloArray[0].sayHello();
        helloArray[1].sayHello();
        helloArray[2].sayHello();
    }
}
