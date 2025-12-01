package sample4_3;

public class Sample4_3 
{
    public static void main(String[] args) 
    {
        RacingCar rrcar1;
        rrcar1 = new RacingCar();
        
        rrcar1.newShow();
    }
}

// 父類別 Car
class Car {
    protected int num;         // protected → 子類別可直接使用
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
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
    
    public void newShow() {
        System.out.println("賽車的車號是 " + num);   // 直接使用 protected 欄位
        System.out.println("汽油量是 " + gas);
        System.out.println("賽車編號是 " + course);
    }
}
