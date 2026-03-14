interface Inter1
{
void display();
}

interface Inter2
{
void show();
}

interface Inter3 extends Inter1,Inter2
{
void print();
}

class TestClass implements Inter3
{

       public void display()
	{
	System.out.println("display() from interface1");
	}

	public void show()
	{
	System.out.println("show() from interface2");
	}

	public void print()
	{
	System.out.println("print() from interface3");
	}

}

class Demo
{
public static void main(String args[])
{
TestClass obj=new TestClass();
obj.display();
obj.show();
obj.print();
}
}