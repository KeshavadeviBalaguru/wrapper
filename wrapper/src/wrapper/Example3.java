package wrapper;

public class Example3 {

	public static void main(String[] args) {
		byte rank=12;
		Byte b1=Byte.valueOf(rank);
		System.out.println(b1);
		System.out.println("------------");
		byte b2=15;
		Byte b=new Byte(b2);
		byte rank2=b.byteValue();
		System.out.println(rank2);
		

	}

}
