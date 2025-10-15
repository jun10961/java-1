package practice.Weak5;

public class WeakCase {
    public static void main(String[] args){
        int day =4;
        String daystr="";
        switch (day){
            case 1:
                daystr = "Sunday"; break;
            case 2:
                daystr = "Monday"; break;
            case 3:
                daystr = "Tuesday"; break;
            case 4:
                daystr = "Wednesday"; break;
            case 5:
                daystr = "Thursday"; break;
            case 6:
                daystr = "Friday";  break;
            case 7:
                daystr = "saturday"; break;

        }
        System.out.print(daystr);
    }
}
