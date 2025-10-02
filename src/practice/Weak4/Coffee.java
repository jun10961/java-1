package practice.Weak4;

public class Coffee {
    String grade;
    void roast(){
        System.out.println("roasting... " + grade);
    }
    void origin(String l) {grade = l;}
}
