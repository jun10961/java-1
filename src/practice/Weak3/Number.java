package practice.Weak3;

public class Number {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args){
        Number h = new Number();
        int num1=3;
        int num2=5;
        int sum=0;

        sum = h.add(num1, num2);
        System.out.println(sum);
    }
}

