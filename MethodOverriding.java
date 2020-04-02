package overRiding;

class A
{
	static int a=10;
	static void show()
	{
			System.out.println("Show of class A");
	}
}
public class MethodOverriding extends A {
	
	static void show()
	{
		System.out.println("Welcome to Show of main class");
		a=20;
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		MethodOverriding m=new MethodOverriding();
		show();
		A.show();
		}

}
