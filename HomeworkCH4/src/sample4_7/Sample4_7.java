package sample4_7;

public class Sample4_7
{
    public static void main(String[] args)
    {
        Car car1;              // 宣告父類別變數 car1
        car1 = new Car();      // 產生 Car 物件

        car1.setcar(1234, 20.5);  // 設定車號與汽油量
        System.out.println(car1); // 直接輸出物件 → 呼叫 toString()
    }
}

class Car
{
    protected int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setcar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public String toString()       // 覆寫 Object 類別的 toString()
    {
        String str = "車號:" + num + "汽油量:" + gas;  // 回傳格式化字串
        return str;               // 讓 println() 能直接輸出物件內容
    }
}

