class thread1 extends Thread
{
    int num;
    thread1(int a)
    {
        num=a;
        this.start();
    }
    public void run()
    {
        try
        {
            if(num<=5)
            {
                thread1 t=new thread1(num+1);
                this.sleep(10000/num);
                System.out.println("HELLO FROM THREAD"+num+"!");
            }
        }
        catch(Exception e)
        {
           System.out.println("intruppted");
        }
    }
} class thread1 extends Thread
{
    int num;
    thread1(int a)
    {
        num=a;
        this.start();
    }
    public void run()
    {
        try
        {
            if(num<=5)
            {
                thread1 t=new thread1(num+1);
                this.sleep(10000/num);
                System.out.println("HELLO FROM THREAD"+num+"!");
            }
        }
        catch(Exception e)
        {
           System.out.println("intruppted");
        }
    }
} 

class threadmain
{
    public static void main(String args[])
    {
        try
        {
            thread1 t1=new thread1(1);
        }
            catch(Exception e)
            {
                System.out.println("intruppted");
            }
        }
    }