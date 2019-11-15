class Gen<T,V>
{
	T ob1;
	V ob2;
	Gen(T o1,V o2)
	{
		ob1=o1;
		ob2=o2;
    }
    void showTypes()
    {


	  System.out.println("Type of T is"+ob1.getClass().getName());
	  System.out.println("TYpe of V is"+ ob2.getClass().getName());

	}
	T getob1()
	{


		return ob1;

    }
    V getob2()
    {

		return ob2;


	}
}
class SimpGen
{

	public static void main(String[] args)
	{
		Gen<Integer,String> tgobj=new Gen<Integer,String>(88,"Generics");
		tgobj.showTypes();
		int v=tgobj.getob1();
		System.out.println("value:"+v);
		String str=tgobj.getob2();
		System.out.println("value"+str);

     }

}