package wrapper;

public class Example7 {

	public static void main(String[] args) {
		boolean value=true;
		Boolean b=Boolean.valueOf(value);
		System.out.println(b);
		System.out.println("-------------");
		boolean br=false;
		Boolean B1=new Boolean(br);
		boolean b2=B1.booleanValue();
		System.out.println(b2);
		

	}

}
