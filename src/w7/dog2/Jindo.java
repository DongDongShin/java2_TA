package w7.dog2;

import w7.dog.Dog;


public class Jindo extends Dog {  //dog을 상속을 함 디폴트 생성자를 호출

	@Override
	public String toString() {
		return "Jindo [" +
				"color=" + color +
				", name=" + name  +
				']';
	}

	private String color; // 검정, 하양, 갈색

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jindo other = (Jindo) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	private static int averageWeight = 45;

	// 생성자 첫 문장이 super나 this가 아닌 경우, 
	// 생성자 첫 문장으로 super()가 자동으로 삽입되는데
	// super()는 수퍼클래스의 파라미터 없는 생성자를 호출하는 것이다.
	// 그런데 수퍼클래스인 Dog에는 파라미터 없는 생성자가 없으므로 
	// 컴파일 에러.
	// 생성자 첫 문장으로 super(name)를 넣어주면 해결된다.
	// Dog의 생성자를 호출하는 것이다.
	// 그렇게 하면, Dog의 생성자가 지금 생성되는 Jindo 객체의 name 필드를 초기화해준다.
	public Jindo(String name, String color) {
		super(name);
		this.color = color;
	}

	public String speak() {
		return "Jin jin!";
	}

	public int getAverageWeight() {
		return averageWeight;
	}

}