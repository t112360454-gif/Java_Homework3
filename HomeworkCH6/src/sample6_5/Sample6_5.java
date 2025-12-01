package sample6_5;

class Sample6_5
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();              // 啟動 car1 這個執行緒

        try
        {
            car1.join();           // 等待 car1 執行緒結束
        }
        catch (InterruptedException e)
        {
            // 若等待過程被中斷，就會進到這裡
        }

        System.out.println("結束main()的處理工作。");
    }
}

class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("正在進行" + name + "的處理工作。");
        }
    }
}

