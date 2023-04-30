package w1.d1assignments;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=11;
		boolean isPrime=true;
		for(int i=2;i<number-1;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println("The given number " +number +" is a Prime Number" );
		else
			System.out.println("The given number " +number +" is not a Prime Number" );
		
	}

}
