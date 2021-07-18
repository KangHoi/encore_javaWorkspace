package pizza.test;

import pizza.child.BulgogiPizza;
import pizza.child.PineapplePizza;
import pizza.child.PotatoPizza;
import pizza.parent.Pizza;
import pizza.service.impl.PizzaServiceImpl;

public class PizzaTest {

	public static void main(String[] args) {
		
		Pizza p1 = new PotatoPizza(20000,"Mr.Pizza");
		Pizza p2 = new BulgogiPizza(32000,"59Pizza");
		Pizza p3 = new PineapplePizza(28000,"PizzaHut");
		
		Pizza[ ] pizzas = {p1, p2, p3};
		
		//sigletone È°¿ë
		PizzaServiceImpl.getinstance().allMakePizza(pizzas);
		
		

	}

}
