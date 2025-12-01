package sample6_1;

class Sample6_1
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();  // 啟動執行緒

        for(int i=0; i<5; i++)
        {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

// Car 類別繼承 Thread 類別
class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }

    // 覆寫 run() 方法，執行緒啟動後會執行此方法
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}
