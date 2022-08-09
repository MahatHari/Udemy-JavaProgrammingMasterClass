package learnprogramming.academy;

public class Printer {
    private  int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel<=100 ? 0: tonerLevel;
        this.pagesPrinted=0;
        this.duplex = duplex;
    }
    public  int addToner(int tonerAmount){
      if(  tonerAmount>0&&tonerAmount<=100){
          int temp= tonerAmount + tonerLevel;
          if(temp>100){
              return -1;
          }
          return this.tonerLevel+=tonerAmount;
      }
    return -1;

    }

    public int printPages(int pages){
        int pagesToPrint= pages;
        if(duplex){
           pagesToPrint =(Math.round((float)pages/2 ));
        }
        pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }
    public  int getPagesPrinted(){
        return pagesPrinted;
    }
}
