package SEE;
import java.util.*;
import CIE.*;
public class SEE extends student
{
	public int SEEmarks[]=new int[5];
	public void getdata()
	{

		super.getdata();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{   System.out.println("enter the SEE marks out of 50 for subject "+(i+1));
			SEEmarks[i]= s.nextInt();

	     }


	}
	public void showdata()
	{

       super.showdata();
       for(int i=0;i<5;i++)
       {
           System.out.println("SEE marks out of 50 in sibject "+(i+1)+":"+SEEmarks[i]);


	     }
      }
}
