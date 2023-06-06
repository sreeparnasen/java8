package functionProgrammingJava;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviourParametarization {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12,3,46,2,37,95,36);
		
		filterAndPrint(numbers , x -> x%2 == 0);
		filterAndPrint(numbers , x -> x%2 != 0);
		
	}
		private static void filterAndPrint(List<Integer> numbers,Predicate<Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
		}
		
	

	}


