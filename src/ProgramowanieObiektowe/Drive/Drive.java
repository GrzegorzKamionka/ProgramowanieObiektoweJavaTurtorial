package ProgramowanieObiektowe.Drive;

import ProgramowanieObiektowe.File.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
