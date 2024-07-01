package visitor;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor{

    private String ext;
    private List<File> files = new ArrayList<>();

    public FileFindVisitor(String ext) {
        this.ext = ext;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(ext)) {
            files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (Entry entry : directory) {
            entry.accept(this);
        }
    }


    public List<File> getFoundFiles() {
        return files;
    }
}
