import java.util.*;

interface Iqueue{
	public void enqueue();
	public void dequeue();
	public boolean isEmpty();
	public boolean isFull();
}

class queue implements Iqueue{
	int q[];
	int front;
	int rear;

	queue(int size){
		q=new int[size];
		front=rear=-1;
	}

	public boolean isEmpty(){
		if(rear==-1)
			return true;
		else
			return false;
	}

	public boolean isFull(){
		if(rear==q.length-1)
			return true;
		else
			return false;
	}

	public void enqueue(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter element: ");
		int ele=s.nextInt();
		if(isFull()){
			System.out.println("\nExtending size of queue\n");
			int temp[]=new int[q.length*2];
			for(int i=0;i<q.length;i++)
				temp[i]=q[i];
			q=temp;
		}
		if(front==-1){
			rear=front=0;
			q[rear]=ele;
		}
		else
			q[++rear]=ele;
	}

	public void dequeue(){
		if(isEmpty())
			System.out.println("Queue Empty\n");
		else
			System.out.println("Deleted element: "+q[front]);
		if(front==rear)
			front=rear=-1;
		else
			front++;
	}

	public void display(){
		if(isEmpty()){
			System.out.print("Queue Empty\n");
			return;
		}
		System.out.println("Elements: ");
		for(int i=front;i<=rear;i++)
			System.out.print(q[i]+" ");
	}
}

class queueTest{
	public static void main(String args[]){
		System.out.println("Enter size of queue: ");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		queue obj=new queue(n);
		int ch;
		do{
			System.out.print("\n1)Enqueue\n2)Dequeue\n3)Display\n4)Exit\nEnter your choice: ");
			ch=x.nextInt();
			switch(ch){
				case 1: obj.enqueue();
				        break;
		        case 2: obj.dequeue();
		                break;
                case 3: obj.display();
                        break;
                case 4: break;
			}
		}while(ch!=4);
	}
}