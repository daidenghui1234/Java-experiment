package 三;

public class ClassRoom implements Runnable{

   Thread student1,student2,teacher;

   ClassRoom(){//构造函数，建立三个线程

     student1 = new Thread(this);

     student2 = new Thread(this);

     teacher = new Thread(this);

   }

   public void run() {//重写run的方法

     String name = Thread.currentThread().getName();//当前线程的名字

     if(name.equals("student1")) {//student1的内容操作

        try {

           System.out.println("我是"+name+"在教室上课，想睡10分钟后再上课");

           Thread.sleep(1000*10);//停止10分钟

        }

        catch(InterruptedException ex){

           System.out.println(name+"被teacher叫醒了");//如果中断就输出这个内容

        }

        student2.interrupt();//student2被叫醒

        System.out.println(name+"开始上课了");

     }else if(name.equals("student2")) {//student2的内容操作

        try {

           System.out.println("我是"+name+"在教室上课，想睡1小时后再上课");

           Thread.sleep(1000*60*60);//停止1小时

        }

        catch(InterruptedException ex){

           System.out.println(name+"被student1叫醒了");//如果中断就输出这个内容

           student2.interrupt();//中断student2

        }

        System.out.println(name+"开始上课了");

     }else if(name.equals("teacher")) {//teacher的内容操作

        for(int i=1;i<=3;++i) {

           System.out.println(name+"喊：上课！");

           try {

             Thread.sleep(1000);

           }

           catch(InterruptedException ex){

            

           }

        }

        student1.interrupt();//老师叫醒学生1

     }

   }

}
