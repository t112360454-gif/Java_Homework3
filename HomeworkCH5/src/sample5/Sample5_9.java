package sample5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Sample5_9
{
    public static void main(String[] args)
    {
        // 檢查使用者是否正確輸入一個檔案名稱
        if (args.length != 1)
        {
            System.out.println("請指定正確的檔案名稱");
            System.exit(1); // 終止程式
        }

        try
        {
            // 使用 args[0] 建立讀取檔案的文字串流
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            
            String str;
            // 逐行讀取資料直到 null（檔案結束）
            while ((str = br.readLine()) != null)
            {
                System.out.println(str);
            }

            br.close(); // 關閉檔案
        }
        catch (IOException e)
        {
            System.out.println("輸入人錯誤");
        }
    }
}

