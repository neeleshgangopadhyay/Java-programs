 
package CIE;
import java.util.*;
public class student
{

  String usn=new String();
  String name=new String();
  int sem;
  Scanner sc=new Scanner(System.in);
  public void getdata()
  {  System.out.println("Enter the usn of the student:"); 
     usn=sc.next();
     System.out.println("Enter the name of the student:"); 
     name=sc.nextLine();
     name=sc.nextLine();
     System.out.println("Enter the semester of the student:"); 
     sem= sc.nextInt();
   }
  public void showdata()
  {

     System.out.println("the usn is : "+usn);
     System.out.println("the name is: "+name);
     System.out.println("the  semester is "+sem);

   }


}
 
