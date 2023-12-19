package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.model.Recipe;

@Repository
public interface RecipeDao extends JpaRepository<Recipe, Integer> {

}
