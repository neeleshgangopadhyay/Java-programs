import java.util.*;
import java.lang.*;
class Bank
{
  Scanner s=new Scanner(System.in);
  public  double camount;
  public  double samount;
  
  public void entsav()
 { System.out.println("enter the ampont you want to store in saving ammount:");
   double am=s.nextDouble();
   samount=samount+am;
   System.out.println(" the ampont present in saving account is: "+samount);
  }
public void entcur()
 { System.out.println("enter the ampont you want to store in current ammount:");
   double am=s.nextDouble();
   camount=camount+am;
   System.out.println(" the ampont present in current account is: "+camount);
  }
  
}
class Current extends Bank
{  Scanner sa=new Scanner(System.in); 
   public void minbal()
 { double sch=0.0;
    if(camount<1000.00)
   { System.out.println("service charged being imposed as amount is less than 1000 Rs");

     sch=(5*camount)/100;
     camount=camount-sch;
     System.out.println(" the ampont present in current account is: "+camount);
   }
 }
  public void displayc()
   { System.out.println("the amount present is: "+camount);
   } 
  
  public void chqbook()
   { double f; 
     System.out.println("enter the amount you want to pay in cheque: ");
     f=sa.nextDouble();
     camount=camount-f;
     System.out.println("your cheque has been approved of Rupees: "+camount); 
     minbal();
   }

 }
 class Savings extends Bank
{  Scanner sc=new Scanner(System.in);
   public void withdrawal()
  { 
    System.out.println("enter the ampont you want to wiyhdraw: ");
    double am=sc.nextDouble();
    samount=samount-am;
    System.out.println("the saving account amount of Rupees is: "+samount);
  }
  
   public void displays()
   { System.out.println("the amount present is: "+samount);
   } 

    public void compound()
  {   double rate=0;
      double time=0;
      double cin;
      System.out.println("the compound interest being given");
       
      if( samount<=1000)
      {  rate=0.01;
         System.out.println("enter the time in years: ");
         time=sc.nextDouble();
      }
     else  if(samount>1000 && samount<=10000)
      {  rate=0.03;
         System.out.println("enter the time in years: ");
         time=sc.nextDouble();
      } 
      else  if(samount>10000)
      {  rate=0.07;
         System.out.println("enter the time in years: ");
         time=sc.nextDouble();
      } 
     double num;
     
     num= 1+rate;
     samount=samount*Math.pow(num,time);
     System.out.println("the amount after compound interst given: "+samount);
  }
} 
 class Bank_Demo
{ public static void main(String[] args)
   { int n=1;
     int ch;
     Scanner m = new Scanner(System.in);
     Current c=new Current();
     Savings s=new Savings();
     s.entsav();
     c.entsav();      


     
     System.out.println("enter the operations you want to perform in bank");
      System.out.println("1-Current account");
      System.out.println("2-Saving account");
     
      ch=m.nextInt();
      switch(ch)
      { case 1: System.out.println("Current account operations 1-for cheque book 2 for display ");
                 n=m.nextInt();
                 if(n==1)
                 c.chqbook();
                 else
                 c.displayc();
                 break; 
        case 2: System.out.println("Savings account operations 1-for withdrawals  2 for display 3 for compound interet getting: ");
                 n=m.nextInt();
                  if(n==1)
                  s.withdrawal();
                     
                 else if(n==2)

                  s.displays(); 
                 else
                  s.compound();                   
       } 
  }           
}       

       
       
       
      


  
              
    




  
    
