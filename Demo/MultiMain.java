public class MultiMain {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Thread1 t1=new Thread1();
        t1.start();
        Runnable1 run1= new Runnable1();
        Thread t2=new Thread(run1);
        t2.start();
    }
    
}
