package class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class SampleIO {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write("Hello Java!");
            bw.newLine();
            bw.write("File I/O Test");
            bw.close();
            System.out.println("已寫入 data.txt 檔案！");

            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String str;
            System.out.println("讀取到的內容為：");
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("檔案輸入輸出發生錯誤！");
        }
    }
}

