package wrapper;

public class Example5 {

	public static void main(String[] args) {
	double price=23.44;
	Double d=Double.valueOf(price);
	System.out.println(d);
	System.out.println("----------");
	double value=34.55;
	Double d1=new Double(value);
	double result=d1.doubleValue();
	System.out.println(result);
	}

}
