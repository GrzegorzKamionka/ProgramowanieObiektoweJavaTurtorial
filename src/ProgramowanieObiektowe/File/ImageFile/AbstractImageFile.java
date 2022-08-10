package ProgramowanieObiektowe.File.ImageFile;

import ProgramowanieObiektowe.File.AbstractFile;
import ProgramowanieObiektowe.File.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
       super(name, size);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public FileType getType() {
        return FileType.IMAGE;
    }
}
