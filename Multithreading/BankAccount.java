package Multithreading;

class BankAccount implements Runnable {
    String name;
    String type;

    @Override
    public void run() {
        Thread t=Thread.currentThread();
        for(int i=1;i<=3;i++){
            System.out.println(name +"("+type+")cheking priority:"  );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static class Main{
        public static void main(String args[]){
            BankAccount user1=new BankAccount();
            user1.name="Alice";
            user1.type="Premium";
            BankAccount user2 = new BankAccount();
            user2.name = "Bob";
            user2.type = "Regular";
            BankAccount user3 = new BankAccount();
            user3.name = "Charlie";
            user3.type = "Basic";
            Thread t1 = new Thread(user1);
            Thread t2 = new Thread(user2);
            Thread t3 = new Thread(user3);
            t1.setPriority(10);
            t2.setPriority(5);
            t3.setPriority(1);
            t1.start();
            t2.start();
            t3.start();
        }
    }
}
