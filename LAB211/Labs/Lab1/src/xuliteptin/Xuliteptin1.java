/*
- Tạo 1 tệp tin bất kì
- Ghi vào trong file đã tạo nội dung: “Welcome to GST.Q7”
- Hiển thị nội dung đã ghi trong file đã tạo
 */
package xuliteptin;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class Xuliteptin1 {

    private static void writeFile(File f) {
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.print("Welcome to GST.Q7");
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readFile(File f) {
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath());
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    return;
                } else {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File f = new File("chuong.txt");
        writeFile(f);
        readFile(f);
    }
}
