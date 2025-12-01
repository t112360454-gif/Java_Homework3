package sample4_13;

public class Sample4_13
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1234, 20.5);   // 產生 Car 物件
        car1.vShow();                     // 呼叫 iVehicle 的方法
        car1.mShow();                     // 呼叫 iMaterial 的方法
    }
}

interface iVehicle                       // 介面 1
{
    void vShow();                         // iVehicle 的抽象方法
}

interface iMaterial                      // 介面 2
{
    void mShow();                         // iMaterial 的抽象方法
}

class Car implements iVehicle, iMaterial  // Car 同時實作兩個介面
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void vShow()                   // 實作 iVehicle 的方法
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    public void mShow()                   // 實作 iMaterial 的方法
    {
        System.out.println("車子的材質是鐵");
    }
}

