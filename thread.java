import java.util.*;
class BMS extends Thread
{
public void run()
{
for(int i=5;i>0;i--)
{
System.out.println("BMS COLLEGE OF ENGINEERING");
try
{
Thread.sleep(10000);
}
catch(Exception e)
{}
}}
}
class cse extends Thread
{
public void run()
{
for(int i=5;i>0;i--)
{
System.out.println("CSE");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{}
}}
}
class thread_demo
{
public static void main(String args[])
{
BMS ob1=new BMS();
cse ob2=new cse();
ob1.start();
ob2.start();
}
}