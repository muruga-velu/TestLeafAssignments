package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int value = 333;
		int sum = 0;
		int rem;
		
		while (value>0) {
			rem = value%10;
			System.out.println("The remainder is: "+rem);
			sum = sum+rem;
			System.out.println("The sum is: "+sum);
			value = value/10;
			System.out.println("The quotient is: "+value);
			System.out.println("######################");
		}
		System.out.println("The sum of the digit is: "+sum);

	}

}
