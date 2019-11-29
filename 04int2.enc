import java.util.*;

interface safe_driving{
	public int safe_speed=100;
	public void speed_of_vehicle();
}

class drive implements safe_driving{
	public void speed_of_vehicle(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter speed of vehicle: ");
		int speed=s.nextInt();
		if(speed<=safe_speed)
			System.out.println("Safe Driving");
		else
			System.out.println("Drive slow");
	}
}

class demo{
	public static void main(String args[]){
		Scanner x=new Scanner(System.in);
		System.out.print("Enter number of vehicle: ");
		int n=x.nextInt();
		drive obj[]=new drive[n];
		for(int i=0;i<n;i++){
			System.out.println("Vehicle "+(i+1)+": ");
			obj[i]=new drive();
			obj[i].speed_of_vehicle();
		}
	}
}