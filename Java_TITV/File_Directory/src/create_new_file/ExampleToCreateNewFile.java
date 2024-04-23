package create_new_file;

import java.io.File;
import java.io.IOException;

public class ExampleToCreateNewFile {
    public static void main(String[] args) {
        File folder1 = new File("F:/Java_TITV/File_Directory/src/create_new_file");

        System.out.println(folder1.exists());

        File folder2 = new File("F:/Java_TITV/File_Directory/src/create_new_file/Directory_1");
        folder2.mkdir();

        File folder3 = new File("F:/Java_TITV/File_Directory/src/create_new_file/Directory_1/Directory_2/Directory_3");
        folder3.mkdirs();
        folder3 = new File("F:/Java_TITV/File_Directory/src/create_new_file/Directory_1/Directory_4/Directory_5");
        folder3.mkdirs();

        File file1 = new File("F:/Java_TITV/File_Directory/src/create_new_file/Directory_1/Test.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
