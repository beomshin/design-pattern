package decorator;

public class UpDownBorder extends Border{

    private char ch;

    protected UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return makeLine(ch, display.getColumns());
        } else if (row == display.getRows() + 1) {
            return makeLine(ch, display.getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
