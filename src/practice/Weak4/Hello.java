package practice.Weak4;

class Hello {
    String toWhom = "world";
    Hello() { }
    Hello(String whom) { setWhom(whom); }
    void setWhom(String whom) { toWhom = whom; }
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}