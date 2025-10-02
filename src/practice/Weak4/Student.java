package practice.Weak4;

public class Student {

    String name;
    double gpa;
    int incomeLevel;

    Student(String name, double gpa, int incomeLevel){
        this.name = name;
        this.gpa = gpa;
        this.incomeLevel = incomeLevel;

    }
    String getName() { return name;}
    double getGPA() {return gpa;}
    int getIncomeLevel() { return incomeLevel;}


}
