package wrapper;

public class Example2 {

	public static void main(String[] args) {

		int age = 22;//primitive data type value
		
		
		Integer myAge = Integer.valueOf(age);//primitive data type value we are storing in an object of Integer class
      
		System.out.println(myAge);
		System.out.println("------------------");
		
		//converting an object type to primitive data type, is called autoUnBoxing
		          int age2=15;
				Integer myAge1 = new Integer(15);//Integer wrapper class object is created with 30 value
				
				int age1 = myAge1;//storing Integer wrapper class object into int primitive data type.
				
				System.out.println(age1);

	}

}
