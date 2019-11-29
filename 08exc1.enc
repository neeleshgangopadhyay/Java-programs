import java.util.*;

class noargs extends Exception{
	public String toString(){
		return ("No argument");
	}
}

class neg_marks extends Exception{
	public String toString(){
		return ("Negative marks");
	}
}

class exc_1{
	public static void main(String args[]){
		try{
			if(args.length==0)
				throw new noargs();
			int neg;
			neg=Integer.parseInt(args[2]);
			if(neg<0)
				throw new neg_marks();
		}
		catch(noargs e){
			System.out.println(e);
		}
		catch(neg_marks e){
			System.out.println(e);
		}
	}
}