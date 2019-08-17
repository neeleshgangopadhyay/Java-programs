import java.util.*;
public class FibonacciSeries
{  public static void main(String[] args)
   {   Scanner s= new Scanner(System.in);
       int a=0 ;
       ;
       int m=1;
       int j;
       int k;
       System.out.println("enter the number of element in  the Fibonacci Series");
       j=s.nextInt();
       System.out.println("the elements in fbonacci are ");System.out.println(a);
       System.out.println(m);

        for(int i=0;i<(j-2);i++)
       { k=a+m;
         System.out.println(" "+k);
         a=m;
         m=k;
 
        }
       
   }
}
     
