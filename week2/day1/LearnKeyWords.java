package week2.day1;

public class LearnKeyWords {
	static {
		num= 20;
		System.out.println("static block");
	}
	static int num ;


	public static void display() {
		System.out.println("display");
	}


	public static void main(String[] args) {
		System.out.println(num);
		Integer i = 0;



		// className.method(); // className.var;
		LearnArrays.show();
		display();
	}





}



