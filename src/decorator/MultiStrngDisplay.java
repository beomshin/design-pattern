package decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStrngDisplay extends Display {

    public List<String> strings = new ArrayList<>();
    public int colum = 0;

    @Override
    public int getColumns() {
        return colum;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        return strings.get(row);
    }

    public void add(String s) {
        if (colum < s.length()) {
            colum = s.length();
        }

        strings.add(s);

        for (int i=0; i < strings.size(); i++) {
            String line  = strings.get(i);
            int padding = colum - line.length();
            if (padding > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(strings.get(i));
                for (int j=0; j < padding; j++) {
                    sb.append(' ');
                }
                strings.set(i, sb.toString());
            }
        }
    }
}
