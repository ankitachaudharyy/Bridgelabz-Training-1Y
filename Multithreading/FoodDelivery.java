package Multithreading;

 class order implements Runnable {
      int orderId;
      String restaurant;
      int deliveryTime;

     public order(int orderId, String restaurant, int deliveryTime) {
         this.orderId = orderId;
         this.restaurant = restaurant;
         this.deliveryTime = deliveryTime;
     }

     @Override
     public void run() {
         try{
             long startTime=System.currentTimeMillis();
             System.out.println(Thread.currentThread().getName()+"picked up order"+orderId+"from"+restaurant);
             System.out.println(Thread.currentThread().getName()+"is delivering order"+orderId);
             Thread.sleep(deliveryTime*1000);
             System.out.println(Thread.currentThread().getName()+"delivered order"+orderId);
             long endTime=System.currentTimeMillis();
             System.out.println("Total delivery time for order"+orderId+"="+(endTime-startTime)/1000+"seconds");

         } catch (InterruptedException e) {
             System.out.println("Delivery interrupted");
         }
     }
 }
public class FoodDelivery{
     public static void main(String args[]){
         order o1=new order(10,"PizzaHut",3);
         order o2=new order(11,"Dominos",5);
         order o3=new order(12,"KFC",6);
         order o4=new order(13,"Mahalaxmi",4);
         order o5=new order(14,"Subway",7);


         Thread t1=new Thread(o1,"Agent A(Express)");
         Thread t2=new Thread(o2,"Agent B(Standard)");
         Thread t3=new Thread(o3,"Agent C(EXpress)");
         Thread t4=new Thread(o4,"Agent D(Economy)");
         Thread t5=new Thread(o5,"Agent E(Standard)");

         t1.setPriority(10);
         t2.setPriority(5);
         t3.setPriority(10);
         t4.setPriority(3);
         t5.setPriority(5);

         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
     }
}