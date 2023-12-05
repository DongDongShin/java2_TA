package zuul11;

/**
 * 게임 아이템 이름, 설명, 무게 등 속성을 갖는다.
 * 
 * @author 정충교
 */
public class Item {
	private String name;
	private String description;
	private int weight;

	/**
	 * Constructor for objects of class Item
	 * 
	 * @param name        아이템의 이름
	 * @param description 아이템에 대한 설명
	 * @param weight      아이템의 무게
	 */
	public Item(String name, String description, int weight) {
		this.name = name;
		this.description = description;
		this.weight = weight;
	}

	/**
	 * 이름을 반환한다.
	 * 
	 * @return 이름.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 이 아이템에 대한 설명을 반환한다.
	 * 
	 * @return 아이템에 대한 설명.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 이 아이템의 무게를 반환한다.
	 * 
	 * @return 아이템의 무게.
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * 이 아이템에 대한 상세한 설명을 반환한다.
	 * 
	 * @return 이 아이템에 대한 상세한 설명이 들어 있는 문자열.
	 */
	public String getLongDescription() {
		return name + " (" + weight + "Kg, " + description + ")";
	}

}
