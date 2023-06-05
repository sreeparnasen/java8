package functionProgrammingJava;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(7,11,56,3,45,25,68,94);
		
		int sum = addListStructured(numbers);
		int squareSum = addSquaredNumber(numbers);
		System.out.println(sum);
		System.out.println(squareSum);

	}
	
	private static int addSquaredNumber(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().map(x->x*x).reduce(0,Integer::sum);
	}

	private static int sum(int a, int b) {
		return a+b;
	}

	private static int addListStructured(List<Integer> numbers) {
		//return numbers.stream().reduce(0,FP02Functional::sum);
		//return numbers.stream().reduce(0, (a,b)->a+b);
		return numbers.stream().reduce(0, Integer::sum);
	}

}//intermediate functions all return stream , and terminal operations like forEach returns values other
//than stream type
