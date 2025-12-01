package sample6_8;

class Sample6_8
{
    public static void main(String[] args)
    {
        Company cmp = new Company();      // 建立公司物件

        Driver drv1 = new Driver(cmp);    // 駕駛 1
        drv1.start();                     // 啟動執行緒

        Driver drv2 = new Driver(cmp);    // 駕駛 2
        drv2.start();                     // 啟動執行緒
    }
}

class Company
{
    private int sum = 0;

    // ★ 加上 synchronized，避免多個執行緒同時進來造成錯誤
    public synchronized void add(int a)
    {
        int tmp = sum;
        System.out.println("目前的合計金額是" + tmp + "元");

        tmp = tmp + a;
        System.out.println("匯到" + a + "元了");

        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}

class Driver extends Thread
{
    private Company comp;

    public Driver(Company c)
    {
        comp = c;
    }

    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            comp.add(50);   // 每次匯 50 元，總共匯 3 次
        }
    }
}

