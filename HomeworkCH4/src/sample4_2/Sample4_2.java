package sample4_2;

public class Sample4_2 {
    public static void main(String[] args) 
    {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
    }
}

// 父類別 Car
class Car 
{
    private int num;
    private double gas;

    public Car() // 建構式
    {
        num = 0; //子類別在建立前會先呼叫父類別無參數的建構式來幫助父類別做初始化
        gas = 0.0;
        System.out.println("產生了車子");
    }
    
    public Car(int n, double g) 
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為 " + num + "，汽油量為 " + gas + "的車子");
    }
    
    public void setCar(int n, double g) 
    {
        num = n;
        gas = g;
        System.out.println("車號設為 " + num + "，汽油量設為 " + gas);
    }
    
    public void show() 
    {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}

// 子類別 RacingCar
class RacingCar extends Car 
{
    private int course;

    public RacingCar() 
    {              
        course = 0;
        System.out.println("生產了賽車");
    }
    
    public RacingCar(int n, double g, int c) 
    {
        super(n, g);                   // 呼叫父類別建構式
        course = c;
        System.out.println("生產了編號為" + course +"的賽車");
    }

    public void setCourse(int c) 
    {     // 子類別新增的方法
        course = c;
        System.out.println("賽車編號設為 " + course);
    }
}
