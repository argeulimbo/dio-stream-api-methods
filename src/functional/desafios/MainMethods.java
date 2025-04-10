package functional.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainMethods {
	
	public static void main(String[] args) {
		
		// StreamAPI - 20 desafios
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//#1. Ordenar por Ordem Numérica		
		numeros.sort(Comparator.naturalOrder());
		System.out.println("1 - Ordenar por Ordem Númerica: " + numeros);
		
		//#2. Imprimir soma dos números pares
		int soma = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("2 - Soma dos números pares = " + soma);		
		
		//#3. Verificar se todos são positivos
		boolean verificaPositivos = numeros.stream().allMatch(n -> n > 0);
		System.out.println("3 - Todos são positivos = " + verificaPositivos);
		
		//#4. Remoção de Ímpares
		System.out.print("4 - Ímpares removidos: ");
		numeros.stream().filter(n -> n % 2 != 1).forEach(n -> System.out.print(" " + n));
		System.out.println();
		
		//#5. Cálculo de Média dos números maiores que 5
		double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("5 - Média dos números maiores que 5 = " + media);
		
		//#6. Verificar número maior que 10
		System.out.print("6 - Maior que 10:");
		numeros.stream().filter(n -> n > 5).forEach(n -> System.out.print(" " + n));
		System.out.println();
		
		//#7. Encontrar o segundo número maior da lista
		List<Integer> ordenadaDesc = numeros.stream()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.collect(Collectors.toList());
		int segundoMaior = ordenadaDesc.get(1);
		System.out.println("7 - Segundo maior = " + segundoMaior);
		
		//#8. Somar os dígitos de todos os números
		System.out.println("8 - Soma dos dígitos dos númreos = " + numeros.stream().reduce(0, (a, b) -> a + b));
		
		//#9. Verificar se todos os números são distintos
		boolean numerosDistintos = numeros.stream().sorted().distinct().count() == numeros.size();
		System.out.println("9 - Todos números são distintos = " + numerosDistintos);
		
		//#10. Agrupe os valores ímpares múltiplos de 3 e 5
		List<Integer> impares = numeros.stream()
				.filter(n -> n % 3 == 0 && n % 5 == 0)
				.collect(Collectors.toList());
		System.out.println("10 - Ímpares múltiplos de 3 e 5 = " + impares);
		
		//#11. Soma dos quadrados de todos os números
		int somaQuadrado = numeros.stream().mapToInt(n -> n * n).sum();
		System.out.println("11 - Soma dos quadrados = " + somaQuadrado);
		
		//#12. Produto de todos os números
		int produto = numeros.stream()
				.reduce(1, (a, b) -> a * b);
		System.out.println("12 - Produto dos números = " + produto);
		
		//#13. Filtrar dentro de intervalo = 5 e 10
		List<Integer> listaIntervalo = numeros.stream()
		.filter(n -> n > 5 && n < 10)
		.collect(Collectors.toList());
		System.out.println("13 - Intervalo entre 5 e 10 = " + listaIntervalo);
		
		//#14. Maior número primo
		Optional<Integer> maiorPrimo = numeros.stream()
				.filter(n -> {
					if (n < 2) return false;
					for (int i = 2; i <= Math.sqrt(n); i++) {
						if (n % i == 0) return false;
					}
					return true;
				})
				.max(Comparator.naturalOrder());
		maiorPrimo.ifPresent(p -> System.out.println("14 - Maior número primo: " + p));
		
		//#15. Verificar se contém pelo menos um número negativo
		boolean verificaNegativo = numeros.stream().allMatch(n -> n < 0);
		System.out.println("15 - Número negativo = " + verificaNegativo);
		
		//#16. Agrupe os números em pares e ímpares
		List<Integer> pares = 
				numeros.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		List<Integer> imparesList = 
				numeros.stream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
		
		System.out.println("16 - Arupar em par e impar, Pares: " + pares + " | ímpares: " + imparesList);
		
		//#17. Filtrar números primos
		List<Integer> primos = numeros.stream()
				.filter(n -> {
					if (n < 2) return false;
					for (int i = 2; i <= Math.sqrt(n); i++) {
						if (n % i == 0) return false;
					}
					return true;
				})
				.collect(Collectors.toList());
		System.out.println("17 - Números primos: " + primos);
		
		//#18. Verificar se todos são iguais
		boolean todosIguais = numeros.stream()
				.distinct() 
				.count() == 1;
		System.out.println("18 - Todos iguais = " + todosIguais);
		
		//#19. Soma dos números divisíveis por 3 e 5
		int somaDiv =numeros.stream()
				.filter(n -> n % 3 == 0 && n % 5 == 0)
				.mapToInt(n -> n)
				.sum();
		System.out.println("19 - Soma dos divisíveis por 3 e 5 = " + somaDiv);
	}
}
