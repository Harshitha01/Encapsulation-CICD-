public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel,boolean duplex) {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
    }

    public int addToner(int TonerAmount) {

        int tempAmount = TonerAmount + tonerLevel;
        if(tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += TonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
