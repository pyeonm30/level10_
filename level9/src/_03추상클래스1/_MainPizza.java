package _03추상클래스1;

import java.util.ArrayList;

public class _MainPizza {

	public static void main(String[] args) {

		PizzaService ps = new PizzaService();
		ArrayList<Pizza> orderList = new ArrayList<Pizza>();
		
		orderList.add(new SweetPotatoPizza(12000, "피자헛"));
		orderList.add(new BlugogiPizza(10000, "일인피자"));
		orderList.add(new PineApplePizza(13000, "미스터피자"));
		orderList.add(new BlugogiPizza(20000, "도미노"));
		orderList.add(new SweetPotatoPizza(40000, "수제피자"));
		orderList.add(new SweetPotatoPizza(10000, "피자스쿨"));
		
		ps.orderPizzas(orderList);
		
	}

}
