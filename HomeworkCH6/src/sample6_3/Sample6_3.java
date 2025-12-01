package sample6_3;

class Sample6_3
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1號車");
        car1.start();  // 啟動新執行緒

        for(int i=0; i < 5; i++)
        {
            System.out.println("正在進行main()的處理工作");
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
        for(int i=0; i < 5; i++)
        {
            try
            {
                sleep(1000);  // 暫停1000毫秒(1秒)
                System.out.println("正在進行" + name + "的處理工作");
            }
            catch(InterruptedException e)
            {
                // 處理可能由 sleep 拋出的例外
            }
        }
    }
}
