package sample4_11;

public class Sample4_11
{
    public static void main(String[] args)
    {
        Vehicle[] vc;                 // 宣告抽象類別陣列
        vc = new Vehicle[2];          // 配置兩個元素

        vc[0] = new Car(1234, 20.5);  // 第一個物件是 Car 類別
        vc[1] = new Plane(232);       // 第二個物件是 Plane 類別

        for(int i = 0; i < vc.length; i++)
        {
            if(vc[i] instanceof Car)  // 檢查是否為 Car 類別
                System.out.println("第" + (i + 1) + "個物件是Car類別");
            else
                System.out.println("第" + (i + 1) + "個物件不是Car類別");
        }
    }
}

abstract class Vehicle
{
    protected int speed;

    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }

    abstract void show();             // 抽象方法
}

class Car extends Vehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

class Plane extends Vehicle
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    public void show()
    {
        System.out.println("飛機的班次是" + flight);
        System.out.println("速度是" + speed);
    }
}

