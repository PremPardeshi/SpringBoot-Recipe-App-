package com.springrest.springrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recipe {

	@Id
	private Long recipe_id;
	private String recipe_name;
	private Float price;
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recipe(Long recipe_id, String recipe_name, Float price) {
		super();
		this.recipe_id = recipe_id;
		this.recipe_name = recipe_name;
		this.price = price;
	}
	public Long getRecipe_id() {
		return recipe_id;
	}
	public void setRecipe_id(Long recipe_id) {
		this.recipe_id = recipe_id;
	}
	public String getRecipe_name() {
		return recipe_name;
	}
	public void setRecipe_name(String recipe_name) {
		this.recipe_name = recipe_name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Recipe [recipe_id=" + recipe_id + ", recipe_name=" + recipe_name + ", price=" + price + "]";
	}
	
	
	
}
