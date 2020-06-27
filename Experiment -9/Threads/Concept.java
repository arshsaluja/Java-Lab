//1)	Write a program to implement the concept of threading by extending Thread Class and Runnable interface
public class thread1 extends Thread {
     public void run(){
        System.out.println("thread is running");//creating thread by extending thread class
    }
     public static void main(String[] args) {
        thread1 t = new thread1();
        t.start();
    }
}
//implementing runnable interface
public class thread6  implements Runnable{
    public void run(){
        System.out.println("runnable");
    }
    public static void main(String[] args) {
        
        thread6 t=new thread6();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.start();
        t2.start();
    }
}
