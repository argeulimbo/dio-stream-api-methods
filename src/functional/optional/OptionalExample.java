package functional.optional;

import java.util.Optional;

import entities.Produto;

public class OptionalExample {

	public static void main(String[] args) {

		// Optional String
		Optional<String> optionalString = Optional.of("Andressa");
		System.out.println("#1 Optional String - " + optionalString.get());

		// Optional Integer
		Optional<Integer> optionalInteger = Optional.of(42);
		System.out.println("#2 Optinal Integer - " + optionalInteger.get());

		// Optional Double
		Optional<Double> optionalDouble = Optional.of(78.4);
		System.out.println("#3 Optinal Double - " + optionalDouble.get());

		// Optional Object
		Optional<Produto> optionalProduto = Optional.of(new Produto("TV", 5, 900.00, "01.01.001"));
		System.out.println("#4 Optional Object - " + optionalProduto.get());
		
		//Optional Boolean
		Optional<Boolean> optionalBoolean = Optional.of(true);
		System.out.println("#5 Optional Boolean - " + optionalBoolean.get());

		/*//Opt - orElse
		optionalString = null;
		String result = optionalString.orElse("Default");
		System.out.println("orElse() - " + result);*/
		
		//Opt - ifPresent(consumer)
		optionalString = Optional.of("Hello");
		optionalString.ifPresent(value -> System.out.println("Valor presente: " + value));
	}
}
