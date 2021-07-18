package pizza.parent;

/*
 * 추상 클래스의 용도
 * 1. 여러 종류의 피자를 만들어내기 위한 공통적인 작업(필드, 메소드)은 그대로 자식들에게 물려주고
 * 2. 여러 종류의 피자가 만들어 질 수 있는 결정적 부분은 추상메소드로 선언해둔다.. public abstract void topping();
 * 
 * 완벽한 추상성 --> interface --> 사용자와 작성자 간 Contract
 * 부분적인 추상성 --> 추상클래스 --> 결정적으로 다븐 부분 미완으로 돌려준다.. --> 지식이 미완의 완성하도록 리딩..
 */


public abstract class Pizza {
	protected int price;
	protected String storeName;
	
	
	public Pizza(int price, String storeName) {
		super();
		this.price = price;
		this.storeName = storeName;
	}
	
	public Pizza() {
		this(15000, "PizzaHut");
	}
	
	//기능 하나 더 추가
	public void makePizza() {
		dough();
		topping();
		bake();
		cutting();
		boxing();
	}
	
	public void dough() {
		System.out.println("피자 반죽을 활용해 도우를 잘 만들어 줍니다..");
		
	}
	
	public void bake() {
		System.out.println("180도에서 10분가 구워줍니다..");
	}
	
	public void boxing() {
		System.out.println("피자를 상자에 포장합니다..");
	}
	
	public void cutting() {
		System.out.println("8조각으로 나누어줍니다..");
	}

	public abstract void topping();

	
	//정보 리턴 기능

	@Override
	public String toString() {
		return "상점 이름: " + storeName + " " + price + "원";
	}
}
