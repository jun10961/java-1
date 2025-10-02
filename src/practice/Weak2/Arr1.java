package practice.Weak2;

public class Arr1 {
    public static  void main(String[] args){
        double arr1[] = {1.1, 2.3, 4.7, 7.5};
        double arr2[]= new double[4];
        arr2[0] = 1.1;
        arr2[1]=2.3;
        arr2[2]=4.7;
        arr2[3]=7.5;
        System.out.printf("배열크기: %d %d\n", arr1.length, arr2.length);
        System.out.printf("arr1[0] = %.1f, arr2[0] = %.1f\n", arr1[0], arr2[0]);
        System.out.printf("arr1[1] = %.1f, arr2[1] = %.1f\n", arr1[1], arr2[1]);
        System.out.printf("arr1[2] = %.1f, arr2[2] = %.1f\n", arr1[2], arr2[2]);
        System.out.printf("arr1[3] = %.1f, arr2[3] = %.1f\n", arr1[3], arr2[3]);
    }
}
