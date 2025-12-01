package sample4_8;

public class Sample4_8
{
    public static void main(String[] args)
    {
        Car car1 = new Car();   // 產生第一個 Car 物件
        Car car2 = new Car();   // 產生第二個 Car 物件（不同物件）

        Car car3;               // 宣告變數 car3
        car3 = car1;            // car3 與 car1 指向同一個物件

        System.out.println("car1與car2相同 " + car1.equals(car2));
        System.out.println("car1與car3相同 " + car1.equals(car3));
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
}
