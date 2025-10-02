package practice.Weak3;

public class WebName {
    public static void main(String[] args){
        String[] webname1 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};

        String[] webname2 = new String[4];
        webname2[0] = "Google Chrome";
        webname2[1] = "Microsoft Edge";
        webname2[2] = "Mozilla Firefox";
        webname2[3] = "Naver Whale";

        System.out.println("초기화방법");
        for(int i = 0; i < 4; i++){
            System.out.printf("%s의 문자열 길이: %d\n", webname1[i], webname1[i].length());
        }

        System.out.println("new사용방법");
        for(int i = 0; i < 4; i++){
            System.out.printf("%s의 문자열 길이: %d\n", webname2[i], webname2[i].length());
        }


    }
}
