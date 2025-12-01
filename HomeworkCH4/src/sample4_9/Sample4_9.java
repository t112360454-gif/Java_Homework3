package sample4_9;

public class Sample4_9
{
    public static void main(String[] args)
    {
        Car[] cars;              // 宣告父類別陣列
        cars = new Car[2];       // 建立可存放兩個物件的陣列

        cars[0] = new Car();     // 第一個元素放入 Car 物件
        cars[1] = new RacingCar(); // 第二個元素放入 RacingCar 物件

        for(int i = 0; i < cars.length; i++)   // 逐一檢查每個物件
        {
            Class cl = cars[i].getClass();     // 呼叫 getClass() 取得物件類別資訊
            System.out.println("第" + (i+1) + "個物件的類別是" + cl);
        }
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

class RacingCar extends Car
{
    public RacingCar()
    {
        System.out.println("生產了賽車");
    }
}

