package CIE;

import java.util.*;

public class Internals
{

  public int marks[]=new int[5];
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
          System.out.println("the subject "+(j+1)+"is:"+marks[j]);
        }

      }

 }
