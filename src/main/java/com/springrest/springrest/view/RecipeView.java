package com.springrest.springrest.view;

public class RecipeView {

	private long recipe_id;
	private String recipe_name;
	private float price;
	public RecipeView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecipeView(long recipe_id, String recipe_name, float price) {
		super();
		this.recipe_id = recipe_id;
		this.recipe_name = recipe_name;
		this.price = price;
	}
	public long getRecipe_id() {
		return recipe_id;
	}
	public void setRecipe_id(long recipe_id) {
		this.recipe_id = recipe_id;
	}
	public String getRecipe_name() {
		return recipe_name;
	}
	public void setRecipe_name(String recipe_name) {
		this.recipe_name = recipe_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "RecipeView [recipe_id=" + recipe_id + ", recipe_name=" + recipe_name + ", price=" + price + "]";
	}
			
	
}
