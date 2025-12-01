package sample6_6_improved;

//執行緒要處理的工作內容
class CarTask implements Runnable {

 private final String name;

 public CarTask(String name) {
     this.name = name;
 }

 @Override
 public void run() {
     // 模擬執行任務，多次輸出
     for (int i = 0; i < 5; i++) {
         System.out.println(name + " 正在執行工作...");
         try {
             Thread.sleep(500); // 暫停 0.5 秒
         } catch (InterruptedException e) {
             System.out.println(name + " 的執行緒被中斷！");
             return;
         }
     }
     System.out.println(name + " 的工作已完成。");
 }
}

public class Sample6_6 {

 public static void main(String[] args) {
     CarTask car1 = new CarTask("1號車");

     Thread th1 = new Thread(car1);
     th1.start();

     // main 執行緒自行執行其他任務
     for (int i = 0; i < 5; i++) {
         System.out.println("main() 正在執行自己的工作...");
         try {
             Thread.sleep(300);
         } catch (InterruptedException e) {
             System.out.println("main 執行緒被中斷！");
         }
     }

     // 等待子執行緒完成
     try {
         th1.join();
     } catch (InterruptedException e) {
         System.out.println("join() 執行過程被中斷");
     }

     System.out.println("main() 工作結束。");
 }
}

