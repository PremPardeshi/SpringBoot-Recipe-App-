package com.springrest.springrest.service;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springrest.springrest.Dao.RecipeDao;
import com.springrest.springrest.model.Recipe;
import com.springrest.springrest.view.RecipeView;


@Service
public class RecipeServiceImpl implements RecipeService{

	List<Recipe> list;
	
	@Autowired
	RecipeDao recipeDao;
	
//	public RecipeRepository() {
//		list= new ArrayList<>();
//		list.add(new Recipe(100,"Poha", 30));
//		list.add(new Recipe(101, "VadaPav" , 20));
//		list.add(new Recipe(102, "Dosa" , 50));
//	}
	
	public Recipe createRecipe(RecipeView R) {
		Recipe newRecipe= new Recipe();
		newRecipe.setRecipe_id(R.getRecipe_id());
		newRecipe.setPrice(R.getPrice());
		newRecipe.setRecipe_name(R.getRecipe_name());
		this.recipeDao.save(newRecipe);
		return newRecipe;
		
//		Recipe newRecipe= new Recipe();
//		newRecipe.setPrice(R.getPrice());
//		newRecipe.setRecipe_id(R.getRecipe_id());
//		newRecipe.setRecipe_name(R.getRecipe_name());
//		list.add(newRecipe);
//		return newRecipe;
	}


	@Override
	public List<Recipe> getRecipes() {
		return this.recipeDao.findAll();
//		return list;
	}


	@Override
	public Optional<Recipe> getRecipe(int id) {
		
		return this.recipeDao.findById(id);
//		Recipe R= null;
//		for (Recipe recipe : list) {
//			if(recipe.getRecipe_id()==id) {
//				 R= recipe;
//				break;
//			}
//		}
//		return R;
	}
	
	@Override
	public String delRecipe(int id) {
		try {
		recipeDao.deleteById(id);
		return "Deleted Succesfully" ;
		}
		catch (Exception e) {
			return "No Recipe Present With"+id;
		}
//		Recipe R= null;
//		for (Recipe recipe : list) {
//			if(recipe.getRecipe_id()==id) {
//				 R= recipe;
//				 list.remove(R);
//				break;
//			}
//		}
//		return R;
	}


	@Override
	public Recipe updRecipe(RecipeView R) {
		int id=(int) R.getRecipe_id();
		Recipe upRecipe= recipeDao.findById(id).get();
		System.out.println(upRecipe);
		upRecipe.setPrice(R.getPrice());
		upRecipe.setRecipe_name(R.getRecipe_name());
		
		return upRecipe;
//		Recipe P = null;
//		for (Recipe recipe : list) {
//			if(recipe.getRecipe_id()==R.getRecipe_id()) {
//				P=recipe;
//				recipe.setPrice(R.getPrice());
//				recipe.setRecipe_name(R.getRecipe_name());
//				break;
//			}
//	}
//		return P;
	}

}


