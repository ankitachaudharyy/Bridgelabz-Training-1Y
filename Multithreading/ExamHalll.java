package Multithreading;

 class Entry implements Runnable{

     @Override
     public void run() {
         try{
             while(true) {
                 System.out.println("Student entering:");
                 Thread.sleep(1000);
             }
         }catch (Exception e){}
     }
 }
 class QuestionPaper implements Runnable{
     @Override
     public void run() {
         try{
             Thread.sleep(5000);
             System.out.println("Question paper distributed");
         }catch(Exception e){}
     }
 }
 class Attendance implements Runnable{
     @Override
     public void run() {
         try{
             Thread.sleep(10000);
             System.out.println("Attendance marked");
         }catch (Exception e){}
     }
 }
class Collection implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(15000);
            System.out.println("Answer sheets collected");
        }catch (Exception e){}
    }
}
public class ExamHalll{
     public static void main (String args[]){
         Thread t1=new Thread(new Entry(),"Entry");
         Thread t2=new Thread(new QuestionPaper(),"Question");
         Thread t3 =new Thread(new Attendance(),"Attendance");
         Thread t4=new Thread(new Collection(),"Collection");

         t2.setPriority(10);
         t3.setPriority(8);
         t1.setPriority(5);

         System.out.println(t1.getName()+":"+t1.getState());
         System.out.println(t2.getName()+":"+t2.getState());
         System.out.println(t3.getName()+":"+t3.getState());
         System.out.println(t4.getName()+":"+t4.getState());

         t1.start();
         t2.start();
         t3.start();
         t4.start();
     }

}
