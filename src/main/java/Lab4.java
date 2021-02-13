
public class Lab4 {

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.a=10;
		System.out.println("a="+obj.a);
		obj.b=20;
		System.out.println("b="+obj.b);
		
		obj.add();
		
		Test2 object = new Test2();
		object.a=34;
		System.out.println("a= "+object.a);
		object.b=4;
		System.out.println("b= "+object.b);
		object.multiply();
		
		System.out.println("Now time for division");
		
		
	
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

class Test2
{
       int a, b, c;
       
       void multiply()
       {
    	   c=a*b;
    	   System.out.println("Multiplication of a and b is "+c);
       }
}

