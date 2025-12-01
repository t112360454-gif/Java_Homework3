package sample4_1;

public class Sample4_1 {

	public static void main(String[] args) 
	{
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		
		rccar1.setCourse(5);
	}

}

//父類別 Car
class Car 
{
 private int num; //宣告私有的欄位，子類別無法繼承
 private double gas;

 public Car() // 建構式
 {
     num = 0; //子類別在建立前會先呼叫父類別無參數的建構式來幫助父類別做初始化
     gas = 0.0;
     System.out.println("產生了車子");
 }
//被子類別繼承的方法
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

//子類別 RacingCar
class RacingCar extends Car { //賽車繼承汽車，繼承類別需使用extends
 private int course; //子類別新增的欄位

 public RacingCar() 
 {               // 建構式
     course = 0;
     System.out.println("產生了賽車");
 }

 public void setCourse(int c) 
 {     // 子類別新增的方法
     course = c;
     System.out.println("賽車編號設為 " + course);
 }
}

