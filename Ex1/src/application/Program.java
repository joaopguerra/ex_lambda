package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Jos�");
		list.add("Marta");
		list.add("Jo�o");
		list.add("Pedro");

		//list.sort((n1, n2) -> n1.toUpperCase().compareTo(n2.toUpperCase()));
		//list.removeIf(s1 -> s1.charAt(0) == 'J');
		List<String> upper = list.stream().map(s1 -> s1.toUpperCase()).collect(Collectors.toList());
		
		upper.forEach(System.out::println);

		
	}
}
