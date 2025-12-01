package sample6_7;

class Sample6_7
{
    public static void main(String[] args)
    {
        Company cmp = new Company();   // 建立公司物件

        Driver drv1 = new Driver(cmp); // 建立駕駛物件1
        drv1.start();                  // 啟動執行緒

        Driver drv2 = new Driver(cmp); // 建立駕駛物件2
        drv2.start();                  // 啟動執行緒
    }
}

class Company
{
    private int sum = 0;

    public void add(int a)      // 匯入金額的處理方法
    {
        int tmp = sum;
        System.out.println("目前的合計金額是" + tmp + "元");

        tmp = tmp + a;
        System.out.println("匯入" + a + "元了");

        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;              // 將暫存的金額回寫
    }
}

class Driver extends Thread
{
    private Company comp;

    public Driver(Company c)
    {
        comp = c;
    }

    public void run()           // 進行匯入金額動作
    {
        for (int i = 0; i < 3; i++)
        {
            comp.add(50);
        }
    }
}
