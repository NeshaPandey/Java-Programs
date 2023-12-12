public class mythread extends Thread{
    public void run()
    {
        for(int i=-0; i<10; i++)
        {
            System.out.println("i="+i);
        }
    }
}class ThreadExampleDemo{
    public static void main(String[] args) {
        mythread t=new mythread();
        t.start();
    }
}
