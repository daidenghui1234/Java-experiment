package 四;

public class Demo {

   public static void main(String[] args){

     WareHouse warehouse = new WareHouse();

     warehouse.driver.setName("运货司机");//给线程进行命名

     warehouse.remover.setName("装运工");

     warehouse.admin.setName("仓库管理员");

     warehouse.driver.start();//司机的线程开始了

   }

}