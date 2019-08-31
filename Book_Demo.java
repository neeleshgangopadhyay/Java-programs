import java.util.*; 
class  Book
{ public String name=new String();
  public String author=new String();
  double price;
  int num_pages;
  Scanner s=new Scanner(System.in); 
    Book()
  { name="Book Name";
    author=" author";
    price=0.0;
    num_pages=0;
  }
  Book(String a,String b,double p,int n)
  { name=a;
    author=b;
    price=p;
    num_pages=n;
  }
  public void getdetails()
  {
     System.out.println("enter the name of the book");
     name=s.next();
     System.out.println("enter the author name of the book");
     author=s.next();
     System.out.println("enter the price of the book");
     price=s.nextDouble();
     System.out.println("enter the number of pages of the book");
     num_pages=s.nextInt();
    
  }
  public void toString1()
  {  System.out.println(" the name of the book:"+name);
     
     System.out.println(" the author name of the book:"+author);
     
     System.out.println(" the price of the book:"+price);
     
     System.out.println(" the number of pages of the book:"+num_pages);
   }  
}
class Book_Demo
{  public static void main(String[] args)
   { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of books you wants to getdetails");
     int num=sc.nextInt(); 
     Book b[]=new Book[num]; 
     for(int i=0;i<num;i++)
     {   b[i]=new Book(); 
         b[i].getdetails();}
     for(int j=0;j<num;j++)
      {  b[j].toString1();}                     
     
     System.out.println("seeing the use of parameterised constructors"); //
    Book b2=new Book("the diary of anne frank","Anne Frank",300.25,300);
     b2.toString1();
     Book bi[]=new Book[num];
  
     
     
    
     
    }
}

