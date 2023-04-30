package w1.d1assignments;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNo=0, secondNo = 1, sum = 0;

		for (int i = 0; i < 11; i++) {
			sum = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = sum;
			System.out.println(sum);
		}

	}

}
