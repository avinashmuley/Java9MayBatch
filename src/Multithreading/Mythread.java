package Multithreading;

public class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("is run method");
    }
}


class MyThreadImpl{
    public static void main(String[] args) {
    Mythread thread= new Mythread();
       thread.start();
    }
}
