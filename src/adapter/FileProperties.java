package adapter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIo {

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileReader("src/adapter/" + filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileWriter("src/adapter/" + filename), "");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
