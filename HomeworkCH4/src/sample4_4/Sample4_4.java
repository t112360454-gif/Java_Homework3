package sample4_4;

public class Sample4_4 {
    public static void main(String[] args) 
    {
    	RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		
        rccar1.show();                         // 呼叫子類別覆寫後的方法
    }
}

// 父類別 Car
class Car {
    protected int num;
    protected double gas;
    
    public Car() // 建構式
    {
        num = 0; //子類別在建立前會先呼叫父類別無參數的建構式來幫助父類別做初始化
        gas = 0.0;
        System.out.println("生產了車子");
    }
    
    public void setCar(int n, double g) 
    {
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
    }

    public void show() {                       // 父類別版本
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

    public void setCourse(int c) 
    {    
        course = c;
        System.out.println("賽車編號設為 " + course);
    } 
    
    @Override
    public void show() {                        // 子類別覆寫 show()
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
        System.out.println("賽車編號是 " + course);
    }
}

