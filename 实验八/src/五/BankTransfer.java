package 五;

public class BankTransfer {
    public static void main(String[] args) {
        //创建两个Customer的对象
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        //利用start（）方法调用类Customer的run方法
        c1.start();
        c2.start();
    }
}