package sample6_6;

class Sample6_6
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");

        Thread th1 = new Thread(car1); // 建立Thread類別的物件
        th1.start();                   // 啟動執行緒

        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class Car implements Runnable   // 實作Runnable介面
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }

    public void run()           // 覆寫run方法
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在進行" + name + "的處理");
        }
    }
}

