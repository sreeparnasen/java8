package functionProgrammingJava;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInListStructured(List.of(2,7,98,56,34,36,98));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		
	}

}
