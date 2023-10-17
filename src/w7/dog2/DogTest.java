package w7.dog2;

// 문제로 제시되는 초기 코드

import w7.dog.Dog;
import w7.dog.Jindo;
import w7.dog.Yorkie;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DogTest {
	public static void main(String[] args) {

		Set<Jindo> dogs = new TreeSet<>();
		dogs.add(new Jindo("Jindol", "black"));
		dogs.add((new Jindo("Baku", "white")));
		dogs.add(new Jindo("Smart", "white"));
		dogs.add((new Jindo("Smart", "white")));
		System.out.println(dogs.size());


	}
}