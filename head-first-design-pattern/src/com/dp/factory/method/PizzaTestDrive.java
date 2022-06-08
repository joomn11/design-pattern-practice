package com.dp.factory.method;

import com.dp.factory.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("Cheese");
		System.out.println(pizza);
		
	}
}
