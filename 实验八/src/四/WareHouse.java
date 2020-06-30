package 四;

public class WareHouse implements Runnable{

   Thread driver,remover,admin;

   WareHouse(){//构造函数，建立三个线程
     driver = new Thread(this);
     remover = new Thread(this);
     admin = new Thread(this);
   }

   public void run() {//重写run方法
     String name = Thread.currentThread().getName();//获取当前线程的名字
     if(name.equals("运货司机")) {//货运司机的操作
        System.out.println("我是"+name+"，我在等装运工的工作完成了才能开车！");
        try {
           remover.start();//装运工线程开始，叫装运工了
           remover.join();//联合装运工线程。跟他是一条线了
        }
        catch(InterruptedException ex){
           System.out.println("过程出现问题！");
        }

        System.out.println("货运司机开始开车");
     }else if(name.equals("装运工")) {//装运工的操作
        System.out.println("我是"+name+"，我在等仓库管理员的开门才能装运货物！");
        try {
           admin.start();//仓库管理员线程开始，叫仓库管理员了
           admin.join();//联合仓库管理员线程，跟他是一条线了
        }
        catch(InterruptedException ex){
           System.out.println("过程出现问题！");
        }
        System.out.println("装运工开始装运货物！");
     }else if(name.equals("仓库管理员")) {//仓库管理员的操作
        System.out.println("我是"+name+"，我正在开门！");
        System.out.println("打开仓库门要3秒");
        try {
           admin.sleep(1000);

           System.out.println("3");

           admin.sleep(1000);

           System.out.println("2");

           admin.sleep(1000);

           System.out.println("1");

        }

        catch(InterruptedException ex){

           System.out.println("过程出现问题！");
        }
        System.out.println("仓库门打开了！");
     }
   }
}