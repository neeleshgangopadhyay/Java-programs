package CIE;
import java.util.*;
public class student
{

  String usn=new String();
  String name=new String();
  int sem;
  Scanner sc=new Scanner(System.in);
  public void getdata()
  {
     usn=sc.next();
     name=sc.nextLine();
     sem= sc.nextInt();
   }
  public void showdata()
  {

     System.out.println("the usn is :"+usn);
     System.out.println("the name is:"+name);
     System.out.println("the  semester is"+sem);

   }


}
class Internals
{

   int marks[]=new int[5];
   Scanner s=new Scanner(System.in);
  public void getdata()
   {


     for(int i=0;i<5;i++)
     {
         marks[i]=s.nextInt();

     }
   }
  public  void showdata()
    {

       for(int j=0;j<5;j++)
       {
          System.out.println("the subject"+(j+1)+"is:"+marks[j]);
        }

      }

 }









