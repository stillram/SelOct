package week2.day1;

public class LearnConstructor {
	
	int num; // instance or global variable
	public LearnConstructor() { // constructor
		this(1000);  //calling the another cons
		System.out.println("Constructor");
		
	}
	public LearnConstructor(int a) { // parameterized constructor
		num = a;
		System.out.println("Constructor " +a);
	}
	
	public void display() {
//		int num; // local 
	System.out.println("display " +num);	
	}
	
	public static void main(String[] args) {
		LearnConstructor ls = new LearnConstructor();
//		ls.display();
	}

}



