package base_work_with_file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f1 = new File("F:\\Java_TITV\\File_Directory\\src");

        String[] fList = f1.list();
        File[] f2List = f1.listFiles();


        for (String fL : fList) {
            System.out.println(fL);
        }

        for (File fL2 : f2List) {
            System.out.println(fL2.getName());
        }
    }
}
