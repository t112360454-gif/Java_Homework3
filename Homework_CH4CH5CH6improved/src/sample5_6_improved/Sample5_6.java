package sample5_6_improved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5_6 {

    public static void main(String[] args) {
        System.out.println("請輸入一行文字：");

        String line = readLineFromConsole();
        if (line != null) {
            System.out.println("你輸入的內容是：" + line);
        } else {
            System.out.println("輸入失敗！");
        }
    }

    // 將「讀取一行字串」封裝成方法，可重複使用
    private static String readLineFromConsole() {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        try {
            return br.readLine();
        } catch (IOException e) {
            System.out.println("讀取資料時發生錯誤：" + e.getMessage());
            return null;
        }
        // 不關閉 br，因為它會連同 System.in 一起被關閉
    }
}
