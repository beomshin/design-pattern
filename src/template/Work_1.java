package template;

import java.io.IOException;
import java.io.InputStream;

public class Work_1 {

    public static void main(String[] args) {

        InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

    }
}
