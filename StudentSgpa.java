import java.util.*;
class student
{  public String usn= new String();
   public String name=new String();
    int credit[] = new int[6];
    int mark[] =new int[6];
   public double sgpa;
   public void accept()
   { Scanner sc=new Scanner(System.in);
     System.out.println(" enter the usn of the student:");
     usn=sc.nextLine();
     System.out.println(" enter the name of the student:");
     name=sc.nextLine();
     System.out.println(" enter the credits of 6 subject read by students respectively:");
     for(int i=0;i<6;i++)
      { System.out.print("  ");
        credit[i]=sc.nextInt();
      }
     for(int j=0;j<6;j++)
     {System.out.print(" enter the marks of the student for subject out of 10 ");
      mark[j]=sc.nextInt();
      System.out.println("");
     }
   }
   public void calsgpa()
    {   int csum=0;int tsum=0;
     for(int k=0;k<6;k++)
      csum=csum+credit[k];
     for(int m=0;m<6;m++)
      tsum=(tsum+mark[m]*credit[m]);     
      sgpa=(double)tsum/csum;
    }
   public void display()
   {System.out.println("  Usn:"+usn);
    System.out.println("  Name"+name);
    for(int g=0;g<6;g++)
    { System.out.println("  the student marks: "+mark[g]);
    }
    for(int f=0;f<6;f++)
    {System.out.println("  the subject credit are: "+credit[f]);
     }
    System.out.println(" the student sgpa is: "+sgpa);
    } 
}
 
public class StudentSgpa
{
  public static void main(String[] args)
  {   student  s=new student(); 
      System.out.println(" enter the details of the student:");
      s.accept();
      s.calsgpa();
      System.out.println("  the details of the student are:");
      s.display();
   }
}
