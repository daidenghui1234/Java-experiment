package 五;

class Bank{
    //balance用于记录银行总余额
    private static int balance = 0;
    //用synchronized关键字设定该方法为线程同步的
    public synchronized static void take(int money) {
        int temp = balance;
        temp += money;
        //利用sleep（）方法令当前正在执行的线程进入休眠状态，且参数类型必须为int
        try {Thread.sleep((int)(1000*Math.random()));}
        catch(InterruptedException e) {}
        balance = temp;
        System.out.println("银行总余额为：" + balance);
    }
}