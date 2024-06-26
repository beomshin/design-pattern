package adapter;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        Print_2 p2 = new PrintBanner_2("Hello");
        p2.printWeak();
        p.printStrong();
    }


}
