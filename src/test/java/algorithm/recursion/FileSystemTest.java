package algorithm.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileSystemTest {

    @Test
    public void test() {

        FileSystem.Directory root = new FileSystem.Directory();
        root.name = "root";

        FileSystem.Directory folder1 = new FileSystem.Directory();
        folder1.name = "folder1";
        folder1.files.add("file1.txt");
        folder1.files.add("file2.doc");

        FileSystem.Directory subFolder1 = new FileSystem.Directory();
        subFolder1.name = "subFolder1";

        FileSystem.Directory folder2 = new FileSystem.Directory();
        folder2.name = "folder2";
        folder2.sub.add(subFolder1);

        subFolder1.files.add("file3.txt");
        subFolder1.files.add("file4.jpg");

        folder2.files.add("file5.pdf");

        root.sub.add(folder1);
        root.sub.add(folder2);
        root.files.add("file6.txt");

        FileSystem fileSystem = new FileSystem();

        var paths = fileSystem.searchFiles(root, ".txt");
        Assertions.assertEquals(paths.get(0), "root/file6.txt");
        Assertions.assertEquals(paths.get(1), "root/folder1/file1.txt");
        Assertions.assertEquals(paths.get(2), "root/folder2/subFolder1/file3.txt");

        paths = fileSystem.searchFiles(root, ".doc");
        Assertions.assertEquals(paths.get(0), "root/folder1/file2.doc");

        paths = fileSystem.searchFiles(root, ".jpg");
        Assertions.assertEquals(paths.get(0), "root/folder2/subFolder1/file4.jpg");

        paths = fileSystem.searchFiles(root, "file5.pdf");
        Assertions.assertEquals(paths.get(0), "root/folder2/file5.pdf");

    }
}
