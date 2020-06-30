package 三;

public class Demo {

   public static void main(String[] args) {

     ClassRoom classroom = new ClassRoom();

     classroom.student1.setName("student1");//给各个线程进行命名

     classroom.student2.setName("student2");

     classroom.teacher.setName("teacher");

     classroom.student1.setPriority(10);//设置线程的优先级，首先肯定是student1和student2先睡觉，也就是优先级比老师高

     classroom.student2.setPriority(9);

     classroom.teacher.setPriority(8);//学生睡了才有老师喊上课，这三个优先级就是先弄好最开始的线程的顺序，之后才能正确的执行接下来的内容

     classroom.student1.start();//线程开始

     classroom.student2.start();

     classroom.teacher.start();

   }

}