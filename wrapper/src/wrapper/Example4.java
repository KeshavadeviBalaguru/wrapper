package wrapper;

public class Example4 {

	public static void main(String[] args) {
		float price=12.33f;
		Float f=Float.valueOf(price);
		System.out.println(f);
		System.out.println("-------------");
		float value=20.22f;
		Float f1=new Float(value);
		float result=f1.floatValue();
	     System.out.println(result);	
	}

}
