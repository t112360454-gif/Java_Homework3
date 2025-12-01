package sample4_6;

public class Sample4_6
{
    public static void main(String[] args)
    {
        Car cars[];              // 準備父類別的陣列
        cars = new Car[2];       // 配置兩個元素空間

        cars[0] = new Car();     // 建立父類別的物件
        cars[0].setCar(1234, 20.5);

        cars[1] = new RacingCar();  // 建立子類別的物件
        cars[1].setCar(4567, 30.5);

        for(int i = 0; i < cars.length; i++)   // 以父類別陣列操作父/子類別物件
        {
            cars[i].show();      // 多型：依物件實際型態呼叫對應的 show()
        }
    }
}

class Car
{
    protected int num;           // 父類別的 protected 欄位
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show()      // 父類別的 show 方法
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car
{
    private int course;

    public RacingCar()
    {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }

    public void show()     // 子類別覆寫 show 方法
    {
        System.out.println("賽車的車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}
