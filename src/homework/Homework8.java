package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


class Login{
    private String id;
    private String password;
    private Map<String, String> loginlist;
    Scanner scanner = new Scanner(System.in);

    public Login() {
        loginlist = new HashMap<>();
        loginlist.put("myId", "myPass");
        loginlist.put("myId2", "myPass2");
        loginlist.put("myId3", "myPass3");

    }

    public boolean enter(){

        System.out.println("id와 password를 입력해주세요.");
        System.out.print("id : ");
        id = scanner.nextLine().trim();

        if(loginlist.containsKey(id)){
            System.out.print("password : ");
            password = scanner.nextLine().trim();
            if(Objects.equals(password, loginlist.get(id))){
                System.out.println("id와 비밀번호가 일치합니다.");
                return true;
            }

            else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요\n");
                return false;
            }

        }

        else {
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                return false;
        }
    }

}


public class Homework8 {
    public static void main(String[] args){

        Login login = new Login();

        while (!login.enter());


    }
}
