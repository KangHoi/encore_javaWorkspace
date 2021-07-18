package pizza.service.impl;

import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceImpl implements PizzaService{
	
	//sigletone ∆–≈œ
	static final PizzaServiceImpl service = new PizzaServiceImpl(); //1.
	private PizzaServiceImpl() {} //2.
	public static PizzaServiceImpl getinstance() {
		return service;
	}//3.
	
	@Override
	public void allMakePizza(Pizza[] pizzas) {
		for(Pizza p : pizzas) {
			System.out.println(p);
			p.makePizza();
			System.out.println("==========================");
		}//for
		
	}//allMakePizza
	
	

}//class
