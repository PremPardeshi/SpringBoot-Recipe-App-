package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.view.RecipeView;
import com.springrest.springrest.model.Recipe;
import com.springrest.springrest.service.RecipeService;



@RestController
public class RecipeController {
	
	@Autowired
	public RecipeService recipeService;

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String recipe(@RequestBody RecipeView R) {
		return "Welcome To Coding Once Again"+R;
		}
	
	@RequestMapping(path = "/recipe", method = RequestMethod.POST)
	public Recipe createRecipes(@RequestBody RecipeView R){
		System.out.println(R.toString());
		return this.recipeService.createRecipe(R);
		
	}
	
	@RequestMapping(path = "/recipes", method = RequestMethod.GET)
	public List<Recipe> getRecipes(){
		return this.recipeService.getRecipes();
		
	}
	
	@RequestMapping(path = "/recipe", method = RequestMethod.GET)
	public Optional<Recipe> getRecipe(@RequestParam int id){
		return this.recipeService.getRecipe(id);
		}
	
	@RequestMapping(path = "/uprecipe", method = RequestMethod.PUT)
	public Recipe updateRecipe(@RequestBody RecipeView R){
		return this.recipeService.updRecipe(R);
		}
	
	@RequestMapping(path = "/delrecipe", method = RequestMethod.DELETE)
	public String deleteRecipe(@RequestParam int id){
		return this.recipeService.delRecipe(id);
		
	}
}
