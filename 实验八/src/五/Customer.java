package 五;

//模拟用户存款的线程类
class Customer extends Thread{
    public void run() {
        //设定一个对象共存款三次
        for (int i = 0;i < 3;i++) {
            //每次随机存入不定金额
            Bank.take((int)(10000*Math.random()));
        }
    }
}