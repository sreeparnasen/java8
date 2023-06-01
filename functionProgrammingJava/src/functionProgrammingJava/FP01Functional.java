package functionProgrammingJava;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//printAllNumbersInListFunctional(List.of(2,7,98,56,34,36,98));
			//printEvenNumbersInListFunctional(List.of(2,7,98,56,34,36,98));
			//printOddNumbersInListFunction(List.of(3,57,68,97,34,45,96,23));
			printSquaresOfNumbersInList(List.of(3,57,68,97,34,45,96,23));
			List<String> courses = List.of("Java","Spring","Springboot","SpringMVC","HTML","CSS","AWS");
			//courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
			//courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
			courses.stream().map(course -> course.length()).forEach(System.out::println);

		}
	
	private static void printSquaresOfNumbersInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().map(number -> number*number)//mapper lambda function
		.forEach(System.out::println);
		
	}

	private static void printOddNumbersInListFunction(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter(number -> number%2 !=0)
		.forEach(System.out::println);
		
	}

	//private static boolean isEven(int number) {
		//return number%2 == 0;
	//}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		//numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
		numbers.stream().filter(number -> number%2==0)//lambda expression
		.forEach(System.out::println);//method reference
	}
    
	//private static void print(int number) {
		//System.out.println(number);
		
	//}

		private static void printAllNumbersInListFunctional(List<Integer> numbers) {
			// TODO Auto-generated method stub
			//numbers.stream().forEach(FP01Functional::print);
			numbers.stream().forEach(System.out::println);
			
	}

}
