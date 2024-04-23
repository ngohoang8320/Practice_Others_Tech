package base_work_with_file;

import java.io.File;

public class FileExmp {
    public static void main(String[] args) {
        File file = new File("F:\\Java_TITV\\File_Directory\\src");

        printFolderTree(file, 1);
    }

    public static void printFolderTree(File file,
                                       int grade) {
        File[] fList = file.listFiles();

        for (File f : fList) {
            for (int i = 0; i < grade; i++) {
                System.out.print("\t");
            }
            System.out.print("|__");
            System.out.println(f.getName());
            if (f.isDirectory())
                printFolderTree(f, grade + 1);
        }
    }
}
