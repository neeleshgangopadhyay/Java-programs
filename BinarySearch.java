import java.util.*;
public class BinarySearch
{  public static void main(String[] args)
   {  Scanner s= new Scanner(System.in);
     int a[] ; a=new int[10];
      int mid;int beg=0;int end;int m;int j;
      System.out.println("enter the number of element in  the array");
       j=s.nextInt();
       System.out.println("enter the elements in array");
      for(int i=0;i<j;i++)
       { a[i]= s.nextInt();
        }
      System.out.println("enter the number in the array to be searched");
      m=s.nextInt();
     end=j;
      
      while(beg<=end)
     { mid=(beg+end)/2;
       if(a[mid]==m)
        {System.out.println("the element found at position of:"+mid);
         break; 
         }
       else if(a[mid]>m)
        end=mid-1;
       else
        beg=mid+1;
     }
   }
}
     
