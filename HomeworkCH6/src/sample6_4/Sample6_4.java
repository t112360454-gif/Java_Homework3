package sample6_4;

class Sample6_4
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();   // 啟動另一個執行緒

        for(int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1000);   // 暫停 main thread 1000毫秒(1秒)
                System.out.println("正在進行main()的處理工作");
            }
            catch(InterruptedException e)
            {
                // 可能被 sleep 方法拋出的例外處理區
            }
        }
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
        for(int i = 0; i < 5; i++)
        {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}
