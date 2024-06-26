package adapter;

public class PrintBanner_2 extends Print_2{

    private Banner banner;

    public PrintBanner_2(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
