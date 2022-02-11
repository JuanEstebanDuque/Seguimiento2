package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
	
	//Estado
	private Ingredient ingredient;
	
	//Escenarios
	public void setupStage1() {
		ingredient = new Ingredient("Tomate	",245);
	}
	
	@Test
	void addWeightTest() {
		//escenarios
		setupStage1();
		try {
			ingredient.addWeight(54);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		
		//Asserts
		assertEquals(299, ingredient.getWeight());
	}
	
	@Test
	void addWeightTest2() {
		//escenarios
		setupStage1();
		try {
			ingredient.addWeight(-100);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void removeWeightTest1() {
		//escenarios
		setupStage1();
		try {
			ingredient.removeWeight(45);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		
		//Asserts
		assertEquals(200, ingredient.getWeight());
	}
	
	@Test
	void removeWeight2() {
		//escenarios
		setupStage1();
		try {
			ingredient.removeWeight(-100);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}

}
