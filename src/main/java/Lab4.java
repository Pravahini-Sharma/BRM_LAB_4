
public class Lab4 {

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.a=10;
		System.out.println("a="+obj.a);
		obj.b=20;
		System.out.println("b="+obj.b);
		
		obj.add();
		
	
	}

}

class Test
{
          int a, b, total;
    void add()
    {
    	total=a+b;
    	System.out.println("Sum of a and b is = "+total);
    }
}

