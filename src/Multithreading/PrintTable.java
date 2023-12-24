package Multithreading;

public class PrintTable {
    synchronized void printTable(int no){
        for(int i=1;i<=10;i++) {
            System.out.println(i*no);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadImpl{
    public static void main(String[] args) {
        PrintTable printTable = new PrintTable();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                printTable.printTable(5);

            }
        };
         thread1.start();

         Thread thread2 =new Thread(){
             @Override
             public void run() {
                 printTable.printTable(12);
             }
         };
         thread2.start();

         Thread thread3 = new Thread(){
             @Override
             public void run() {
                 printTable.printTable(16);
             }
         };


         thread3.start();
    }
}

