package functionProgrammingJava;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12,3,46,2,37,95,36);
		
		Predicate<Integer> isEven =x -> x%2==0;
		Function<Integer,Integer> square = x -> x*x;
		Consumer<Integer> sysout = System.out::println;
		
		
		numbers.stream().filter(isEven)
		.map(square).forEach(sysout);

	}

}
