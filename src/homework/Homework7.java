package homework;

abstract class Printer{
    public abstract boolean print();

}


class InkjetPrinter extends Printer{
    private String model;
    private int printedCount, availableCount;

    public InkjetPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }



    @Override
    public boolean print(){

        if (availableCount == 0){
            System.out.printf("%s: %d 매째 인쇄 실패 - 잉크 부족.\n", model, printedCount+1);
            return false;
        }
        else if (availableCount >= 1){
            printedCount++;
            availableCount--;
            return true;
        }
        else{
            return false;
        }
    }
}

class LaserPrinter extends Printer{
    private String model;
    private int printedCount, availableCount;

    public LaserPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }

    @Override
    public boolean print(){

        if (availableCount == 0){
            System.out.printf("%s: %d 매째 인쇄 실패 - 토너 부족.\n", model, printedCount+1);
            return false;
        }
        else if (availableCount >= 1){
            printedCount++;
            availableCount--;
            return true;
        }
        else {
            return false;
        }
    }
}



public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
