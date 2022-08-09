package learnprogramming.academy;

public class PrinterV2 {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public PrinterV2(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1 && tonerLevel <=100)?tonerLevel :-1 ;
        this.pagesPrinted = 0;
        this.duplex=duplex;
    }

    public  int addToner(int tonerAmount){
        if(tonerAmount>0&&tonerAmount<=100){
            return (tonerLevel+tonerAmount >100)?-1: (tonerLevel+=tonerAmount);
        }
        return -1;
    }

    public int printPages(int pages){

        int pagesToPrint= duplex ? (Math.round((float)pages/2)) : pages;
        pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return  pagesPrinted;
    }
}
