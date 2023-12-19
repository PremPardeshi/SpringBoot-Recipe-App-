package com.springrest.springrest.service;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.model.Recipe;
import com.springrest.springrest.view.RecipeView;


public interface RecipeService {
	
	public Recipe createRecipe(RecipeView R); 
	
	public List<Recipe> getRecipes();
	
	public Optional<Recipe> getRecipe(int id);

	public String delRecipe(int id);
	
	public Recipe updRecipe(RecipeView R); 
	

}
