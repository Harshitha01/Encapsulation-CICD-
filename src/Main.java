public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        Printer p = new Printer(50,true);
        System.out.println("initial page count = " + p.getPagesPrinted());

        int pagesPrinted = p.printPages(5);
        System.out.printf("Current pages %d, Printer total pages : %d %n ", pagesPrinted, p.getPagesPrinted());

    }
}