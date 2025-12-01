package sample5_1;

class Car
{
    private int num;       // 車號
    private double gas;    // 汽油量

    public Car()           // 無參數建構子
    {
        num = 0;
        gas = 0.0;
        System.out.println("已生產了汽車");
    }

    public void setCar(int n, double g)  // 設定車號與汽油量
    {
        num = n;
        gas = g;

        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show()     // 顯示車子資訊
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

