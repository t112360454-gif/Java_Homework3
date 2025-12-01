package class3;

import java.util.ArrayList;
import java.util.Random;

class SampleUtil {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            list.add(rd.nextInt(100));  // 0~99 的亂數
        }

        System.out.println("隨機產生的五個數字為：");
        for(int n : list) {
            System.out.println(n);
        }
    }
}
