package w7.dog;

// 문제로 제시되는 초기 코드

import java.util.ArrayList;
import java.util.List;

public class DogTest {
	public static void main(String[] args) {
		
		Dog dog ;

		
		dog = new Jindo("Jindol", "black");
		System.out.println(dog);
		System.out.println(dog.getName() + " " + dog.speak());
		Jindo jin = (Jindo) dog;
		System.out.println("Average of Jindos = "+jin.getAverageWeight());

		dog = new Yorkie("Yomi");
		System.out.println(dog);
		System.out.println(dog.getName() + " " + dog.speak());
		Yorkie yo = (Yorkie) dog;
		System.out.println("Average of Yorkies = "+yo.getAverageWeight());
		System.out.println();

		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Jindo("Jindol", "black"));
		dogs.add((new Jindo("Baku", "white")));
		dogs.add(new Yorkie("Yomi"));
		dogs.add(new Yorkie("Yepi"));

		for (Dog d : dogs) {
			System.out.println(d.toString()+" "+d.speak());

		}

	}
}