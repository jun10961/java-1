package practice.Weak3;

public class HelloTest2 {
    void sayHello2(){
        System.out.println("hello");
    }

    public static void main(String[] args){
        HelloTest2 h1 = new HelloTest2();
        h1.sayHello2();
        HelloTest2 h2 = new HelloTest2();
        h2.sayHello2();
    }
}
