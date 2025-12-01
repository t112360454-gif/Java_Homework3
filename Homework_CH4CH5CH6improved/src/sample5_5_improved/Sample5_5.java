package sample5_5_improved;

//自訂例外類別：油量錯誤
class CarException extends Exception {
 private static final long serialVersionUID = 1L;

 public CarException(String message) {
     super(message);
 }
}

class Car {
 private int number;
 private double gas;

 public Car() {
     System.out.println("已建立車輛物件。");
     number = 0;
     gas = 0.0;
 }

 // 仍然使用 throws，語意與原程式相同
 public void setCar(int number, double gas) throws CarException {
     if (gas < 0) {
         // 拋出自訂例外，交由呼叫者處理
         throw new CarException("油量不得為負數！輸入值：" + gas);
     }
     this.number = number;
     this.gas = gas;
     System.out.println("車輛資料已更新。");
 }

 public void show() {
     System.out.println("車號為：" + number);
     System.out.println("油量為：" + gas + " 公升");
 }
}

public class Sample5_5 {
 public static void main(String[] args) {
     Car car1 = new Car();

     try {
         // 故意輸入錯誤油量以觸發例外
         car1.setCar(1234, -10.0);
     } catch (CarException e) {
         System.out.println("捕捉到 CarException： " + e.getMessage());
     }

     // 不管是否拋出例外，最後都會顯示目前狀態
     car1.show();
 }
}
