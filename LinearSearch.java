import java.util.*;
public class LinearSearch
{  public static void main(String[] args)
   {  Scanner s= new Scanner(System.in);
     int a[] ; a=new int[10];
      int m;
      int j;
      System.out.println("enter the number of element in  the array");
       j=s.nextInt();
       System.out.println("enter the elements in array");
      for(int i=0;i<j;i++)
       { a[i]= s.nextInt();
        }
      System.out.println("enter the number in the array to be searched");
      m=s.nextInt();
     
      
     for(int i=0;i<j;i++)
      {if(a[i]==m)
       System.out.println("element found at position:"+i);
      }
   }
}
     
