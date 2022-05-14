package wrapper;

public class Example6 {

	public static void main(String[] args) {
	  char a='P';
	  Character c=Character.valueOf(a);
	  System.out.println(c);
	  System.out.println("------------");
	  char value='D';
	  Character c1=new Character(value);
	  char result=c1.charValue();
	  System.out.println(result);
	  

	}

}
