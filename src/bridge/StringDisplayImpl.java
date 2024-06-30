package bridge;

public class StringDisplayImpl extends DisplayImpl{

    public String string;
    public int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i=0; i< width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
