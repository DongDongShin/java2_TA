package w7.dog;

public class Yorkie extends Dog {
	private static int averageWeight = 4;
	public Yorkie(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Yorkie [" +
				"name=" + name +
				']';
	}

	public int getAverageWeight() {
		return averageWeight;
	}

	public String speak() {
		return "yo yo!";
	}

}