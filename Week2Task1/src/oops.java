import java.util.*;
public class oops {
	//simple program using oops concept
		public static void main(String[] args) 
		{
		    Encap e=new Encap();
			System.out.println("for encapsulation class");
			e.add(2,3); //addition of two integers
			e.add(2.3f,2.7f); // addition of two floats
			Inherit i=new Inherit();
			System.out.println("inherit class is inherited from encap class");
			i.add(2,3); // multiplication of two integers
			Abc p=new Abc();// constructor created, object Instantiation
			p.run();
			p.walk();
		}
	}
	class Encap// Encapsulation
	{
	    public void add(int a,int b)
	    {
	        int c=a+b;
	        System.out.println("int sum "+c);
	    }
	    public void add(float a,float b)// Overload
	    {
	        float c=a+b;
	        System.out.println("float sum "+c);
	    }
	}
	class Inherit extends Encap
	{
	    public void add(int a,int b)// Override
	    {
	        int c=a*b;
	        System.out.println("overrided Add functionality by multiplication "+c);
	    }
	}
	interface aaa// Abstraction
	{
	    void run();
	    void walk();
	}
	class Abc implements aaa
	{
	    public void run()
	    {
	        System.out.println("the system is running ");
	    }
	    public void walk()
	    {
	        System.out.println("the system is walking ");
	    }
	}
