package 二;

class Cinema implements Runnable

{  Thread zhang,sun,zhao;

   TicketSeller seller;

   Cinema()

   {  zhang=new Thread(this);

      sun=new Thread(this);

      zhao=new Thread(this);

      zhang.setName("张小有");

      sun.setName("孙大名");

      zhao.setName("赵中堂");

      seller=new TicketSeller();

   }

   public void run()

   {  if(Thread.currentThread()==zhang)

       {  seller.sellTicket(20);

       }

       else if(Thread.currentThread()==sun)

       {  seller.sellTicket(10);

       }

       else if(Thread.currentThread()==zhao)

       { seller.sellTicket(5);

       }

   }

}