package decorator;

public class SideBorder extends Border {

    private char boderChar;

    public SideBorder(Display display, char c) {
        super(display);
        boderChar = c;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return boderChar + display.getRowText(row) + boderChar;
    }
}
