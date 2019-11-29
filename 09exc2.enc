import java.util.*;

class insufficient extends Exception{
	public String toString(){
		return ("Insufficient Balance");
	}
}

class exc_2{
	public int acc_no;
	public String name;
	public float bal;
	public float amount;
	public float d_amount;
	public float w_amount;
	public void deposit(){
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter amount to deposit: ");
		d_amount=s.nextFloat();
		bal=bal+d_amount;
		System.out.println("Balance: "+bal);
	}
	public void withdraw() throws insufficient{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter amount to withdraw: ");
		w_amount=s.nextFloat();
		bal=bal-w_amount;
		System.out.println("Balance: "+bal);
		if(bal<2000)
			throw new insufficient();
	}
	public static void main(String args[]){
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of account: ");
		int n=s.nextInt();
		int i=0;
		exc_2 obj[]=new exc_2[n];
		while(i<n){
			obj[i]=new exc_2();
			System.out.print("Enter acc_no,name and balance: ");
			obj[i].acc_no=s.nextInt();
			obj[i].name=s.next();
			obj[i].bal=s.nextFloat();
			do{
				System.out.print("\n1)Deposit\n2)Withdrawal\n3)Exit\nEnter your choice: ");
				ch=s.nextInt();
				switch(ch){
					case 1: obj[i].deposit();
							break;
					case 2: try{
								obj[i].withdraw();
							}
							catch(insufficient e){
								System.out.println(e);
							}
							break;
					case 3: break;
				}
			}while(ch!=3);
			i++;
		}
	}
}