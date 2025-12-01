package sample4_10;

public class Sample4_10
{
    public static void main(String[] args)
    {
        Vehicle[] vc = new Vehicle[2];      // 準備抽象類別陣列

        vc[0] = new Car(1234, 20.5);       // 第一個物件：Car 類別
        vc[0].setSpeed(60);                // 設定車子的速度

        vc[1] = new Plane(232);            // 第二個物件：Plane 類別
        vc[1].setSpeed(500);               // 設定飛機的速度

        for (int i = 0; i < vc.length; i++)  // 依序呼叫 show()
        {
            vc[i].show();                  // 會呼叫各自實作的 show()
        }
    }
}

abstract class Vehicle
{
    protected int speed;                   // 速度欄位
    
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }

    abstract void show();                  // 抽象方法 show()
}

class Car extends Vehicle
{
    private int num;                       // 車號
    private double gas;                    // 汽油量

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "、汽油量為" + gas + "的車子");
    }

    public void show()                     // 實作抽象方法 show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

class Plane extends Vehicle
{
    private int flight;                    // 班次

    public Plane(int f)
    {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    public void show()                     // 實作抽象方法 show()
    {
        System.out.println("飛機的班次是" + flight);
        System.out.println("速度是" + speed);
    }
}
