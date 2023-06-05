package functionProgrammingJava;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(7,11,56,3,45,25,68,94);
		
		int sum = addListStructured(numbers);
		System.out.println(sum);

	}

	private static int addListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int number:numbers) {
			
			sum = sum+number;
		}
		return sum;
	}

}
