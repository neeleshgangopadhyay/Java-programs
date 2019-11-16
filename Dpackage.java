import CIE.Internals;
import SEE.SEE;


public class Dpackage
{
	public static void main(String[] args)
	{
	   int marks[]=new int[5];
	   SEE s1=new SEE();
	   Internals c1=new Internals();
	   System.out.println("ENTER THE pERSONAL DETAILS AND  SEE MArKS OUT OF 50 OF ALL SUBJECT:");
	   s1.getdata();
	   System.out.println("ENTER THE CIE MARKS OUT OF 50 OF ALL SUBJECT:");
	   c1.getdata();
	   for(int i=0;i<5;i++)
	   {

		   marks[i]= s1.SEEmarks[i]+c1.marks[i];

	    }
	    System.out.println("THE DETAILS OF STUDENT AND MARKS IN EACH SUBJECT OUT OF 100 ARE:   ");
	    s1.showdata();
	    c1.showdata();
	    for(int i=0;i<5;i++)
	    {

			System.out.println("Subject(out of 100)"+(i+1)+":"+marks[i]);


	     }

	}
}
