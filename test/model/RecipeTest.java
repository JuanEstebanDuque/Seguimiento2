package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	//Estado
	private Recipe recipe;
	
	//Escenarios
	public void setupStage1() {
		recipe = new Recipe();
	}
	
	public void setupStage2() {
		recipe = new Recipe();
		recipe.addIngredient("Cebolla",315);
		recipe.addIngredient("Ajo",58);
		recipe.addIngredient("Arroz",520);
	}

	@Test
	void addIngredientToNewRecipeTest1() {
		//escenarios
		setupStage1();
		String nameIngredient = "Sal";
		double weightIngredient = 12;
		recipe.addIngredient("Sal",12);
		
		//Asserts
		int size = recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);
		assertEquals(nameIngredient, ingredient.getName());
		assertEquals(weightIngredient, ingredient.getWeight());
	}
	
	@Test
	void addIngredientToRecipe() {
		//escenarios
		setupStage2();
		String nameIngredient = "Pimienta";
		double weightIngredient = 6;
		recipe.addIngredient(nameIngredient, weightIngredient);
		
		//Asserts
		int size = recipe.getIngredients().size();
		assertEquals(size, 4);
		Ingredient ingredient = recipe.getIngredients().get(3);
		assertEquals(nameIngredient, ingredient.getName());
		assertEquals(weightIngredient, ingredient.getWeight());
	}
	
	@Test
	void addWeightToAIngredientTest() {
		//escenarios
		setupStage2();
		String nameIngre = "Ajo";
		double weightIngre = 21;
		recipe.addIngredient(nameIngre, weightIngre);
		
		//Asserts
		int size = recipe.getIngredients().size();
		assertEquals(size, 3);
		Ingredient ingredient = recipe.getIngredients().get(1);
		assertEquals(nameIngre, ingredient.getName());
		assertEquals(79, ingredient.getWeight());
	}
	
	@Test
	void removeIngredientToRecipe() {
		//escenarios
		setupStage2();
		String nameIngre = "Ajo";
		recipe.removeIngredient(nameIngre);
		
		//Asserts
		int size = recipe.getIngredients().size();
		assertEquals(size, 2);
		Ingredient ingredient = recipe.getIngredients().get(0);
		Ingredient ingredient1 = recipe.getIngredients().get(1);
		assertNotEquals("Ajo", ingredient.getName());
		assertNotEquals("Ajo", ingredient1.getName());

	}

}
