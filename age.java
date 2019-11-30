import java.util.*;

class WrongAge extends Exception
{
 int i;
 public WrongAge(int x)
 {
  i=x;
 }
 public String toString()
 {
  return "["+i+"] AGE MISSMATCH!!";
 }
}
 
    


class father
{
 public int agef;
 public void father1(int a)throws WrongAge
 {
  agef=a;
  if(agef<=0)
   throw new WrongAge(agef);
  else
   System.out.println("Father's age accepted");
 }
}

class son extends father
{
 public int ages;
 public void son1(int b)throws WrongAge
 {
   ages=b;
   if(agef<=ages)
     throw new WrongAge(ages);
   else
    System.out.println("Ages of FATHER and his SON are recorded.........\nFather : "+agef+"yrs\nSon : "+ages+"yrs");
  }
 }

class exp
{

 public static void main(String args[])
 {
  int m;
  int n;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the age of Father : ");
  m=s.nextInt();
  System.out.println("Enter the age of his Son : ");
  n=s.nextInt();
  father o1=new father();
  son o2=new son();
  try
  {
    o1.father1(m);
    o2.son1(n);
  }
  catch(WrongAge e)
  {
   System.out.println(e);
  }
 }
}