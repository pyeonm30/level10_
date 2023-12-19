package _03추상클래스1;

import java.util.ArrayList;

public class PizzaService {

	void orderPizzas(ArrayList<Pizza> orderList) {
		for(Pizza p : orderList) {
			p.makePizza();
			System.out.println("---------");
		}
	}
	
}
