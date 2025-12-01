package sample4_12;

public class Sample4_12
{
    public static void main(String[] args)
    {
        iVehicle[] ivc;            // 宣告介面的陣列
        ivc = new iVehicle[2];     // 準備介面的陣列空間

        ivc[0] = new Car(1234, 20.5);  // 第一個物件為 Car 類別
        ivc[1] = new Plane(232);       // 第二個物件為 Plane 類別

        for(int i = 0; i < ivc.length; i++)
        {
            ivc[i].show();         // 依照型態呼叫 show → 多型實現
        }
    }
}

interface iVehicle               // 宣告介面
{
    int weight = 1000;           // 欄位必為常數 (public static final)

    void show();                 // 抽象方法，需由類別實作
}

class Car implements iVehicle     // Car 類別實作介面
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號" + num + "，汽油量為" + gas + "的車子");
    }

    public void show()            // 定義介面方法內容
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class Plane implements iVehicle   // Plane 類別實作介面
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    public void show()            // 定義介面方法內容
    {
        System.out.println("飛機的班次是" + flight);
    }
}

