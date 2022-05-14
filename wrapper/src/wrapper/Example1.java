package wrapper;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("For Primitive type:long\n");
		long a=99;
		Long a1=Long.valueOf(a);
		System.out.println(a1);
		System.out.println("----------");
		long b=55;
		Long b1=new Long(b);
		long b2=b1.longValue();
		System.out.println(b2);
		

	}

}
