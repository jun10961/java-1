package homework;

import java.util.Scanner;

class Student {

    long studentNumber;
    String name;
    String major;
    long phoneNumber;
    String phoneNumber2;

    long getStudentNumber() { return studentNumber; }
    void setStudentNumber(long studentNumber) { this.studentNumber = studentNumber; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    String getMajor() { return major; }
    void setMajor(String major) { this.major = major; }

    long getPhoneNumber() { return phoneNumber; }
    void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    String getPhoneNumber2() { return phoneNumber2; }
    void setPhoneNumber2(String phoneNumber2) { this.phoneNumber2 = phoneNumber2; }
}


public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            String inputLine = scanner.nextLine();
            String[] info = inputLine.split(" ");

            long id = Long.parseLong(info[0]);
            String name = info[1];
            String major = info[2];
            long phone = Long.parseLong(info[3]);

            students[i] = new Student();
            students[i].setStudentNumber(id);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(phone);

            String phoneStr = Long.toString(phone);
            String fullPhoneStr = "0" + phoneStr;
            String PhoneNumber2 = fullPhoneStr.substring(0, 3) + "-" +
                    fullPhoneStr.substring(3, 7) + "-" +
                    fullPhoneStr.substring(7);
            students[i].setPhoneNumber2(PhoneNumber2);
        }
        scanner.close();

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        System.out.printf("첫번째 학생: %d %s %s %s\n", students[0].getStudentNumber(), students[0].getName(), students[0].getMajor(), students[0].getPhoneNumber2());
        System.out.printf("두번째 학생: %d %s %s %s\n", students[1].getStudentNumber(), students[1].getName(), students[1].getMajor(), students[1].getPhoneNumber2());
        System.out.printf("세번째 학생: %d %s %s %s\n", students[2].getStudentNumber(), students[2].getName(), students[2].getMajor(), students[2].getPhoneNumber2());
    }
}