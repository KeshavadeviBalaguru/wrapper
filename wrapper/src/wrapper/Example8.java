package wrapper;

public class Example8 {

	public static void main(String[] args) {
		short x=10;
		Short x1=Short.valueOf(x);
		System.out.println(x1);
		System.out.println("-------------");
		short y=12;
		Short y1=new Short(y);
		short y2=y1.shortValue();
		System.out.println(y2);

	}

}
