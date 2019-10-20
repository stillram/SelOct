package week1.day1;

public class Assignment {

	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		assignment.isPrime(37);
		int sumOfDigits = assignment.sumOfDigits(123);
		System.out.println("Sum of digits: "+sumOfDigits);
	}

	public void isPrime(int number) {
		int i,midNumber=0;
		boolean bPrime = true;				
		midNumber=number/2;      
		if(number <= 1){  
			System.out.println("This is NOT prime number "+ number);      
		}else{  
			for(i=2;i<=midNumber;i++){      
				if(number%i==0){  
					bPrime = false;
					System.out.println("Not a prime number "+number);      
					break;      
				}      
			}      
			if(bPrime)  
				System.out.println(number +" is prime number");   
		}  
	}

	public int sumOfDigits(int number) {
		int sum = 0;         
        while (number != 0){ 
            sum = sum + number % 10; 
            number = number/10; 
        } 
        return sum;
	}

}
